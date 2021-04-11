package com.ifrn.sisconpro.model;


import lombok.*;

import javax.persistence.*;

//ANOTACAO JPA
@Entity
@Table(name="TB_FORNECEDOR")
@Embeddable

//ANOTACAO LOMBOK
@Builder(toBuilder = true)
@Data

public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "ramo", nullable = false)
    private String ramo;

    @Column(name = "endereco", nullable = false)
    private String endereco;

    @Column(name = "telefone", nullable = false)
    private String telefone;

}