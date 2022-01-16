package br.com.forclinic.domain.enums;

import lombok.Getter;

@Getter
public enum Sexo {
	
	MASCULINO("Masculino"),
	FEMININO("Feminino");
	
	private String descricao;
	
	private Sexo(String descricao) {
		this.descricao = descricao;
	}	
	
	@Override
	public String toString() {
		return this.descricao;
	}
	
}