package com.projetos.backapploja.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "\"TB007_PRODUTO_GRUPO\"")
public class ProdutoGrupoModel {
    @EmbeddedId
    private ProdutoGrupoModelId id;
}
