package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tipo_equipo")
public class Tipo_equipo {
    @Id
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(length = 500)
    private String descripcion;

    @OneToMany(mappedBy = "tipoEquipo")
    private List<Equipo> equipos;

    @OneToMany(mappedBy = "tipoEquipo")
    private List<Asignacion> asignaciones;
}