package com.projetos.backapploja.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "\"TB004_FORNECEDOR\"")
public class FornecedorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"NU_FORNECEDOR\"", nullable = false)
    private Long nuFornecedor;

    @NotNull
    @Column(name = "\"QT_PRODUTO_FORNECEDOR\"", nullable = false)
    private Integer qtProdutoFornecedor;

    @NotNull
    @Column(name = "\"VR_PRODUTO_FORNECEDOR\"", nullable = false)
    private Float vrProdutoFornecedor;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"NU_EMPRESA\"", nullable = false)
    private EmpresaModel nuEmpresa;

    @Size(max = 255)
    @NotNull
    @Column(name = "\"NO_PRODUTO_FORNECEDOR\"", nullable = false)
    private String noProdutoFornecedor;

    @NotNull
    @Column(name = "\"NO_FORNECEDOR\"", nullable = false, length = Integer.MAX_VALUE)
    private String noFornecedor;

}
