package br.com.forclinic.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.forclinic.domain.model.Usuario;

@Repository
public interface UsarioRepository extends JpaRepository<Usuario, Long> {

}