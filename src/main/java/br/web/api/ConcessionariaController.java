package br.web.api;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.web.domain.entity.Carro;
import br.web.domain.repository.CarroRepository;

@RestController

public class ConcessionariaController {
	@Autowired
	CarroRepository carrorepository;
	@GetMapping("/home")
	public String inicio() {
		return ("OK");
		
	}
	
	
	@PostMapping("/carro")
	public Object cadastrarCarro(@RequestBody CarroDTO carroDTO) {
		try {
			
			Carro carro = toCarro(carroDTO);
			
			Carro carroSalvo = carrorepository.save(carro);
			
			return carroSalvo;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	private Carro toCarro(CarroDTO carroDTO) {
		
		
		Carro carro = new Carro();
		carro.setAno(carroDTO.getAno());
		carro.setNome(carroDTO.getNome());
		carro.setMarca(carroDTO.getMarca());
		return carro;
	}
	
	
	
}
