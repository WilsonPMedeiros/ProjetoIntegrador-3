package com.ifrn.sisconpro.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import java.time.LocalDate;

import javax.persistence.*;

import java.util.Date;

//ANOTACAO JPA
@Entity
@Table(name="TB_PROTOCOLO")
@Embeddable

//ANOTACAO LOMBOK
@Builder(toBuilder = true)
@Data

public class Protocolo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate data;

 //   private statusProtocolo status;
 //   private tipoConteudo identificacao;

    @Column(name = "origem", nullable = false)
    private String origem;

    @Column(name = "destino", nullable = false)
    private String destino;

  //  private objUsuario usuario;

}