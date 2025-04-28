package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "secretarias")
public class Secretarias {
    @Id
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(length = 500)
    private String descripcion;

    @OneToMany(mappedBy = "secretaria")
    private List<Funcionario> funcionarios;

    @OneToMany(mappedBy = "secretaria")
    private List<Asignacion> asignaciones;
}