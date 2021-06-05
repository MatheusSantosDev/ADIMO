package com.web.boot.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.boot.Model.Usuario;



@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long>{

	Optional<Usuario> findByEmail(String email);
}
