package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tipo_documento")
public class Tipo_documento {
    @Id
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(length = 500)
    private String descripcion;

    @OneToMany(mappedBy = "tipoDocumento")
    private List<Documento> documentos;
}