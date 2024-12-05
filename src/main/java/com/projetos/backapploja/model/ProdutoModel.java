package com.projetos.backapploja.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "\"TB005_PRODUTO\"")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"NU_PRODUTO\"", nullable = false)
    private Long nuProduto;

    @NotNull
    @Column(name = "\"VR_PRODUTO\"", nullable = false)
    private Float vrProduto;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"NU_EMPRESA\"", nullable = false)
    private EmpresaModel nuEmpresa;

    @Size(max = 255)
    @NotNull
    @Column(name = "\"NO_PRODUTO\"", nullable = false)
    private String noProduto;

}
