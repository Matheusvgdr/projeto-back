package com.projetos.backapploja.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "\"TB001_USUARIO\"")
@Schema(description = "Representa um usuário do sistema, contendo dados básicos e credenciais.")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"NU_USUARIO\"", nullable = false)
    @Schema(description = "Identificador único do usuário", example = "1")
    private Long nuUsario;

    @NotNull
    @Column(name = "\"IC_USUARIO\"", nullable = false)
    @Schema(description = "Indicador de tipo de usuário (1 = ativo, 0 = inativo)", example = "1")
    private Short icUsuario;

    @Size(min = 8, max = 16)
    @NotNull
    @Column(name = "\"CO_SENHA\"", nullable = false)
    @Schema(description = "Senha do usuário (mínimo 8, máximo 16 caracteres)", example = "senha1234")
    private String coSenha;

    @Size(max = 50)
    @NotNull
    @Column(name = "\"NO_EMAIL\"", nullable = false, length = 50)
    @Schema(description = "E-mail de contato do usuário", example = "usuario@email.com")
    private String noEmail;

    @Size(max = 60)
    @NotNull
    @Column(name = "\"NO_USUARIO\"", nullable = false, length = 60)
    @Schema(description = "Nome completo do usuário", example = "João Silva")
    private String noUsuario;

    public UsuarioModel(Long nuUsario, Short icUsuario, String coSenha, String noEmail, String noUsuario) {
        this.nuUsario = nuUsario;
        this.icUsuario = icUsuario;
        this.coSenha = coSenha;
        this.noEmail = noEmail;
        this.noUsuario = noUsuario;
    }

    public UsuarioModel() {

    }

    public Long getNuUsario() {
        return nuUsario;
    }

    public void setNuUsario(Long nuUsario) {
        this.nuUsario = nuUsario;
    }

    public Short getIcUsuario() {
        return icUsuario;
    }

    public void setIcUsuario(Short icUsuario) {
        this.icUsuario = icUsuario;
    }

    public String getCoSenha() {
        return coSenha;
    }

    public void setCoSenha(String coSenha) {
        this.coSenha = coSenha;
    }

    public String getNoEmail() {
        return noEmail;
    }

    public void setNoEmail(String noEmail) {
        this.noEmail = noEmail;
    }

    public String getNoUsuario() {
        return noUsuario;
    }

    public void setNoUsuario(String noUsuario) {
        this.noUsuario = noUsuario;
    }
}
