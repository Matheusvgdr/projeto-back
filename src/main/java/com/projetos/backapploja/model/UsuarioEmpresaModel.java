package com.projetos.backapploja.model;

import jakarta.persistence.*;

@Entity
@Table(name = "\"TB003_USUARIO_EMPRESA\"")
public class UsuarioEmpresaModel {

    @EmbeddedId
    private UsuarioEmpresaModelId id;

    @ManyToOne
    @MapsId("nuUsuario") // Mapeia idEntity1 para a entidade Entity1
    @JoinColumn(name = "\"NU_USUARIO\"")
    private UsuarioModel usuario;

    @ManyToOne
    @MapsId("nuEmpresa") // Mapeia idEntity2 para a entidade Entity2
    @JoinColumn(name = "\"NU_EMPRESA\"")
    private EmpresaModel empresa;

    public UsuarioEmpresaModelId getId() {
        return id;
    }

    public void setId(UsuarioEmpresaModelId id) {
        this.id = id;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

    public EmpresaModel getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModel empresa) {
        this.empresa = empresa;
    }
}
