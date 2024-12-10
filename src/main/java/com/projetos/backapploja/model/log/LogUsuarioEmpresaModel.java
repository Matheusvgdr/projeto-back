package com.projetos.backapploja.model.log;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "\"TB503_LOG_USUARIO_EMPRESA\"")
public class LogUsuarioEmpresaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"NU_LOG_USUARIO_EMPRESA\"", nullable = false)
    private Long nuLogUsuarioEmpresa;

    @NotNull
    @Column(name = "\"IC_OPERACAO\"", nullable = false)
    private Short icOperacao;

    @NotNull
    @Column(name = "\"DH_OPERACAO\"", nullable = false)
    private Instant dhOperacao;

    @Column(name = "\"NU_EMPRESA\"")
    private Long nuEmpresa;

    @Column(name = "\"NU_USUARIO\"")
    private Long nuUsuario;

}