package com.projetos.backapploja.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

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

    public Long getNuEmpresa() {
        return nuEmpresa;
    }

    public void setNuEmpresa(Long nuEmpresa) {
        this.nuEmpresa = nuEmpresa;
    }

    public String getCoCnpj() {
        return coCnpj;
    }

    public void setCoCnpj(String coCnpj) {
        this.coCnpj = coCnpj;
    }

    public String getNoEmpresa() {
        return noEmpresa;
    }

    public void setNoEmpresa(String noEmpresa) {
        this.noEmpresa = noEmpresa;
    }

    public EmpresaModel(Long nuEmpresa, String coCnpj, String noEmpresa) {
        this.nuEmpresa = nuEmpresa;
        this.coCnpj = coCnpj;
        this.noEmpresa = noEmpresa;
    }

    public EmpresaModel() {
    }


}
