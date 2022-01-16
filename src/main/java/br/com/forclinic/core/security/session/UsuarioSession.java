package br.com.forclinic.core.security.session;

import org.springframework.security.core.context.SecurityContextHolder;

import br.com.forclinic.core.security.UsuarioSecurity;

public class UsuarioSession {

	public static UsuarioSecurity autenticado() {
		try {
			return (UsuarioSecurity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		} catch (Exception e) {
			return null;
		}
	}

}