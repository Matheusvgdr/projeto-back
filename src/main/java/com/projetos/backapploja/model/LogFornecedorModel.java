package com.projetos.backapploja.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "\"TB504_LOG_FORNECEDOR\"")
public class LogFornecedorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"NU_LOG_FORNECEDOR\"", nullable = false)
    private Long nuLogFornecedor;

    @NotNull
    @Column(name = "\"NU_FORNECEDOR\"", nullable = false)
    private Long nuFornecedor;

    @Column(name = "\"NU_EMPRESA\"")
    private Long nuEmpresa;

    @Column(name = "\"QT_PRODUTO_FORNECEDOR\"")
    private Integer qtProdutoFornecedor;

    @Column(name = "\"NO_PRODUTOO_FORNECEDOR\"", length = Integer.MAX_VALUE)
    private String noProdutooFornecedor;

    @Column(name = "\"VR_PRODUTO_FORNECEDOR\"")
    private Double vrProdutoFornecedor;

    @NotNull
    @Column(name = "\"DH_OPERACAO\"", nullable = false)
    private Instant dhOperacao;

    @NotNull
    @Column(name = "\"IC_OPERACA\"", nullable = false)
    private Short icOperaca;

}