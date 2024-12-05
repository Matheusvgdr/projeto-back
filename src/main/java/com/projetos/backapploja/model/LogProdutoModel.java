package com.projetos.backapploja.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "\"TB505_LOG_PRODUTO\"")
public class LogProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"NU_LOG_PRODUTO\"", nullable = false)
    private Long nuLogProduto;

    @NotNull
    @Column(name = "\"IC_OPERACAO\"", nullable = false)
    private Short icOperacao;

    @Column(name = "\"VR_PRODUTO\"")
    private Float vrProduto;

    @NotNull
    @Column(name = "\"DH_OPERACAO\"", nullable = false)
    private Instant dhOperacao;

    @Column(name = "\"NU_EMPRESA\"")
    private Long nuEmpresa;

    @NotNull
    @Column(name = "\"NU_PRODUTO\"", nullable = false)
    private Long nuProduto;

    @Size(max = 255)
    @Column(name = "\"NO_PRODUTO\"")
    private String noProduto;

}