package com.projetos.backapploja.repository;

import com.projetos.backapploja.model.UsuarioModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends RepositoryGenerico<UsuarioModel, Long> {

    //@Query("SELECT u FROM UsuarioModel u WHERE u.noUsuario = ?1")
    List<UsuarioModel> findByNoUsuario(String nome);
}
