package com.projetos.backapploja.model;

import jakarta.persistence.*;


@Entity
@Table(name = "\"TB007_PRODUTO_GRUPO\"")
public class ProdutoGrupoModel {
    @EmbeddedId
    private ProdutoGrupoModelId id;

    @ManyToOne
    @MapsId("nuGrupo") // Mapeia idEntity1 para a entidade Entity1
    @JoinColumn(name = "\"NU_GRUPO\"")
    private GrupoModel grupo;

    @ManyToOne
    @MapsId("nuProduto") // Mapeia idEntity2 para a entidade Entity2
    @JoinColumn(name = "\"NU_PRODUTO\"")
    private ProdutoModel produto;


}
