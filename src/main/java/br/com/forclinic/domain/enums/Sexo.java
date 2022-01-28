package br.com.forclinic.domain.enums;

public enum Sexo {
	
	MASCULINO("Masculino"),
	FEMININO("Feminino");
	
	private String descricao;
	
	private Sexo(String descricao) {
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