package br.com.forclinic.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.forclinic.core.service.DadosInicialService;

@Configuration
@Profile("dev")
public class DevConfig {
	
	@Autowired
	private DadosInicialService dadosInicialService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String geracaoBancoDeDados;

	@Bean
	public boolean instanciarBancoDeDados() {
		if (!geracaoBancoDeDados.equals("create")) {
			return false;
		}
		
		dadosInicialService.instanciarBancoDeDadosTest();
		return true;
	}
	
}