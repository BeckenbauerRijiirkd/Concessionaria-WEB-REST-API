package br.web.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.web.domain.entity.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
	
	
	
}
