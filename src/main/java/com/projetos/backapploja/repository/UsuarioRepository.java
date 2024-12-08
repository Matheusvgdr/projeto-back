package com.projetos.backapploja.repository;

import com.projetos.backapploja.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository< UsuarioModel, Long> {

    //@Query("SELECT u FROM UsuarioModel u WHERE u.noUsuario = ?1")
    List<UsuarioModel> findByNoUsuario(String nome);
}
