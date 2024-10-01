package com.example.inicial1.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited

@Table(name = "libro")
public class Libro  extends Base {

    @Column(name= "genero")
    private String genero;

    @Column(name= "titulo")
    private String titulo;

    @Column(name= "paginas")
    private int paginas;

    @Column(name= "fecha")
    private int fecha;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}