package br.com.forclinic.domain.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.forclinic.domain.enums.Perfil;
import br.com.forclinic.domain.enums.Sexo;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "usuario")
@DynamicInsert(value = true)
@Inheritance(strategy = InheritanceType.JOINED)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false)
	private String senha;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String celular;

	private Boolean admistradorConta = Boolean.FALSE;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Sexo sexo;

	@JsonIgnore
	@CreationTimestamp
	@Column(nullable = false)
	private LocalDateTime dataCadastro;

	@JsonIgnore
	@UpdateTimestamp
	@Column(nullable = false)
	private LocalDateTime dataAtualizacao;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "usuario_perfil", joinColumns = @JoinColumn(name = "usuario_id"))
	@Column(name = "perfil", nullable = false)
	@Enumerated(EnumType.STRING)
	private Set<Perfil> perfis = new HashSet<>();

	public Usuario() {

	}

	public Usuario(Long id, String email, String senha, String nome, String celular,
			Boolean admistradorConta, Sexo sexo, LocalDateTime dataCadastro, LocalDateTime dataAtualizacao) {
		this.id = id;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.celular = celular;
		this.admistradorConta = admistradorConta;
		this.sexo = sexo;
		this.dataCadastro = dataCadastro;
		this.dataAtualizacao = dataAtualizacao;
	}

	public void addPerfil(Perfil perfil) {
		perfis.add(perfil);
	}

}
