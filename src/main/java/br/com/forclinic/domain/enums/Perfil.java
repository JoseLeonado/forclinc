package br.com.forclinic.domain.enums;

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
		return descricao;
	}	
	
	public String getDescricao() {
		return descricao;
	}
	
}