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
@Table(name = "\"TB001_USUARIO\"")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"NU_USUARIO\"", nullable = false)
    private Long nuUsario;

    @NotNull
    @Column(name = "\"IC_USUARIO\"", nullable = false)
    private Short icUsuario;

    @Size(min = 8, max = 16)
    @NotNull
    @Column(name = "\"CO_SENHA\"", nullable = false)
    private String coSenha;

    @Size(max = 50)
    @NotNull
    @Column(name = "\"NO_EMAIL\"", nullable = false, length = 50)
    private String noEmail;

    @Size(max = 60)
    @NotNull
    @Column(name = "\"NO_USUARIO\"", nullable = false, length = 60)
    private String noUsuario;

}

