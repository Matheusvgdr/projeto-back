package com.projetos.backapploja.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "\"TB008_MOVIMENTACAO\"")
public class MovimentacaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"NU_MOVIMENTACA\"", nullable = false)
    private Long nuMovimentacao;

    @NotNull
    @Column(name = "\"TP_PAGAMENTO\"", nullable = false)
    private Short tpPagamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"NU_PRODUTO\"")
    private ProdutoModel nuProduto;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"NU_GRUPO\"")
    private GrupoModel nuGrupo;

    @NotNull
    @Column(name = "\"DH_EVENTO\"", nullable = false)
    private Instant dhEvento;

}
