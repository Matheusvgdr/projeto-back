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
@Table(name = "\"TB501_LOG_USUARIO\"")
public class LogUsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"NU_LOG_USUARIO\"", nullable = false)
    private Long nuLogUsuario;

    @NotNull
    @Column(name = "\"IC_OPERACAO\"", nullable = false)
    private Short icOperacao;

    @Column(name = "\"IC_USUARIO\"")
    private Short icUsuario;

    @NotNull
    @Column(name = "\"DH_OPERACAO\"", nullable = false)
    private Instant dhOperacao;

    @NotNull
    @Column(name = "\"NU_USUARIO\"", nullable = false)
    private Long nuUsuario;

    @Size(max = 255)
    @Column(name = "\"CO_SENHA\"")
    private String coSenha;

    @Size(max = 255)
    @Column(name = "\"NO_EMAIL\"")
    private String noEmail;

    @Size(max = 255)
    @Column(name = "\"NO_USUARIO\"")
    private String noUsuario;

}