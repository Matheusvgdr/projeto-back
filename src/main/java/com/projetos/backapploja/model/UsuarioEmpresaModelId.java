package com.projetos.backapploja.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class UsuarioEmpresaModelId implements java.io.Serializable {

    @NotNull
    @Column(name = "\"NU_USUARIO\"", nullable = false)
    private Long nuUsuario;

    @NotNull
    @Column(name = "\"NU_EMPRESA\"", nullable = false)
    private Long nuEmpresa;

}