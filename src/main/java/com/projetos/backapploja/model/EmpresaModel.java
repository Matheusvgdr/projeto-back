package com.projetos.backapploja.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "\"TB002_EMPRESA\"")
public class EmpresaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"NU_EMPRESA\"", nullable = false)
    private Long nuEmpresa;

    @Size(min = 14, max = 14)
    @NotNull
    @Column(name = "\"CO_CNPJ\"", nullable = false)
    private String coCnpj;

    @Size(max = 100)
    @NotNull
    @Column(name = "\"NO_EMPRESA\"", nullable = false)
    private String noEmpresa;

}
