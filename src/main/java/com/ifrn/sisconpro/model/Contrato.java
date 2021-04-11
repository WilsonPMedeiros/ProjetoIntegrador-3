package com.ifrn.sisconpro.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

//ANOTACAO JPA
@Entity
@Table(name="TB_CONTRATO")
@Embeddable

//ANOTACAO LOMBOK
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
//@RequiredArgsConstructor
@AllArgsConstructor
@Setter
@Getter


public class Contrato{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "numero")
    private int numero;

    @Column(name = "valorInicial")
    private Double valorInicial;


  //  private contStatus status;

    @Column(name = "fonteRecurso")
    private String fonteRecurso;

    @Column(name = "dataInicioVigencia")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dataInicioVigencia;

    @Column(name = "dataFinalVigencia")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dataFinalVigência;


}

