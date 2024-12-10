package com.projetos.backapploja.model.log;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "\"TB507_LOG_PRODUTO_GRUPO\"")
public class LogProdutoGrupoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"NU_LOG_PRODUTO_GRUPO\"", nullable = false)
    private Long nuLogProdutoGrupo;

    @Column(name = "\"NU_PRODUTO\"")
    private Long nuProduto;

    @Column(name = "\"NU_GRUPO\"")
    private Long nuGrupo;

    @NotNull
    @Column(name = "\"DH_OPERACAO\"", nullable = false)
    private Instant dhOperacao;

    @NotNull
    @Column(name = "\"IC_OPERACAO\"", nullable = false)
    private Short icOperacao;

}