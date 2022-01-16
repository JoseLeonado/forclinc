package br.com.forclinic.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.forclinic.core.service.DadosInicialService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DadosInicialService dbService;

	@Bean
	public boolean instanciarBancoDeDados() {
		dbService.instanciarBancoDeDadosTest();
		return true;
	}
	
}