package com.projetos.backapploja.repository;

import com.projetos.backapploja.model.UsuarioEmpresaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioEmpresaRepository extends JpaRepository<UsuarioEmpresaModel, Long> {

        @Query("SELECT ue FROM UsuarioEmpresaModel ue WHERE ue.id.nuUsuario = ?1")
        List<UsuarioEmpresaModel> findByNuUsuario( Long oi);



}
