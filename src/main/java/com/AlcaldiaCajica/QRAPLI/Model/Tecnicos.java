package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tecnicos")
public class Tecnicos {
    @Id
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, length = 100)
    private String especialidad;

    @Column(length = 20)
    private String telefono;

    @OneToMany(mappedBy = "tecnico")
    private List<Mantenimiento> mantenimientos;
}