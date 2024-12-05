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
public class ProdutoGrupoModelId implements java.io.Serializable {

    @NotNull
    @Column(name = "\"NU_GRUPO\"", nullable = false)
    private Long nuGrupo;

    @NotNull
    @Column(name = "\"NU_PRODUTO\"", nullable = false)
    private Long nuProduto;

}