package com.projetodto.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetodto.usuario.entites.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{

}
