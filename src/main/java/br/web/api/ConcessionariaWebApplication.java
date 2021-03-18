package br.web.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication @EnableSwagger2
@EntityScan("br.web.domian.entity")
@ComponentScan("br.web.api")
@EnableJpaRepositories("br.web.domain.repository")
public class ConcessionariaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConcessionariaWebApplication.class, args);
	}

}
