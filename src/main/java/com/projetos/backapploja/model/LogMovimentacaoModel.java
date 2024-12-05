package com.projetos.backapploja.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "\"TB508_LOG_MOVIMENTACAO\"")
public class LogMovimentacaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"NU_LOG_MOVIMENTACAO\"", nullable = false)
    private Long nuLogMovimentacao
            ;

    @NotNull
    @Column(name = "\"NU_MOVIMENTACA\"", nullable = false)
    private Long nuMovimentaca;

    @Column(name = "\"TP_PAGAMENTO\"")
    private Short tpPagamento;

    @Column(name = "\"NU_PRODUTO\"")
    private Long nuProduto;

    @Column(name = "\"NU_GRUPO\"")
    private Long nuGrupo;

    @Column(name = "\"DH_EVENTO\"")
    private Instant dhEvento;

    @NotNull
    @Column(name = "\"DH_OPERACAO\"", nullable = false)
    private Instant dhOperacao;

    @NotNull
    @Column(name = "\"IC_OPERACAO\"", nullable = false)
    private Short icOperacao;

}