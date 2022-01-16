package br.com.forclinic.api.v1.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CredenciaisDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String email;
	private String senha;
	
	public CredenciaisDTO() {
	}

	public CredenciaisDTO(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}	

}