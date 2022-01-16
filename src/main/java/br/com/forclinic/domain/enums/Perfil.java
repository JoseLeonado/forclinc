package br.com.forclinic.domain.enums;

import lombok.Getter;

@Getter
public enum Perfil {

	ADMIN("ROLE_ADMIN"), 
	PROFISSIONAL_SAUDE("ROLE_PROFISSIONAL_SAUDE"),
	RECEPCIONISTA("ROLE_RECEPCIONISTA");

	private String descricao;
	
	private Perfil(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return this.descricao;
	}	
	
}