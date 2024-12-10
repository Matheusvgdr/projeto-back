package com.projetos.backapploja.model.log;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "\"TB502_LOG_EMPRESA\"")
public class LogEmpresaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"NU_LOG_EMPRESA\"", nullable = false)
    private Long nuLogEmpresa;

    @NotNull
    @Column(name = "\"IC_OPERACAO\"", nullable = false)
    private Short icOperacao;

    @NotNull
    @Column(name = "\"DH_OPERACAO\"", nullable = false)
    private Instant dhOperacao;

    @NotNull
    @Column(name = "\"NU_EMPRESA\"", nullable = false)
    private Long nuEmpresa;

    @Size(max = 255)
    @Column(name = "\"CO_CNPJ\"")
    private String coCnpj;

    @Size(max = 255)
    @Column(name = "\"NO_EMPRESA\"")
    private String noEmpresa;

}