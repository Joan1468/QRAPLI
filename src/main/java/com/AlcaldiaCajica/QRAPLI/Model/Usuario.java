package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(name = "es_administrador", nullable = false)
    private boolean esAdministrador;

    @OneToMany(mappedBy = "usuario")
    private List<Equipo> equiposRegistrados;

    @OneToMany(mappedBy = "tecnico")
    private List<Mantenimiento> mantenimientosRealizados;
}