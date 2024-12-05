package com.projetos.backapploja.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "\"TB003_USUARIO_EMPRESA\"")
public class UsuarioEmpresaModel {
    @EmbeddedId
    private UsuarioEmpresaModelId id;
}
