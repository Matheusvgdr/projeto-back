package com.projetos.backapploja.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "\"TB006_GRUPO\"")
public class GrupoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"NU_GRUPO\"", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "\"VR_GRUPO\"", nullable = false)
    private Float vrGrupo;

    @Size(max = 100)
    @NotNull
    @Column(name = "\"NO_GRUPO\"", nullable = false)
    private String noGrupo;


}
