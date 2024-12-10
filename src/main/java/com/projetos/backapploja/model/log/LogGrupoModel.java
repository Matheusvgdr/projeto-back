package com.projetos.backapploja.model.log;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "\"TB506_LOG_GRUPO\"")
public class LogGrupoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"NU_LOG_GRUPO\"", nullable = false)
    private Long nuLogGrupo;

    @NotNull
    @Column(name = "\"NU_GRUPO\"", nullable = false)
    private Long nuGrupo;

    @Column(name = "\"NO_GRUPO\"", length = Integer.MAX_VALUE)
    private String noGrupo;

    @Column(name = "\"VR_GRUPO\"")
    private Double vrGrupo;

    @NotNull
    @Column(name = "\"DH_OPERACAO\"", nullable = false)
    private Instant dhOperacao;

    @NotNull
    @Column(name = "\"IC_OPERACAO\"", nullable = false)
    private Short icOperacao;

}