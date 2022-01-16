package br.com.forclinic.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.forclinic.config.service.DBService;

@Configuration
@Profile("dev")
public class DevConfig {
	
	@Autowired
	private DBService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String geracaoBancoDeDados;

	@Bean
	public boolean instanciarBancoDeDados() {
		if (!geracaoBancoDeDados.equals("create")) {
			return false;
		}
		
		dbService.instanciarBancoDeDadosTest();
		return true;
	}
	
}