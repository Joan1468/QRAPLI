package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "mantenimiento")
public class Mantenimiento {
    @Id
    private Long id;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false, length = 50)
    private String tipo; // Preventivo, Correctivo

    @Column(length = 1000)
    private String descripcion;

    @Column(length = 1000)
    private String observaciones;

    @ManyToOne
    @JoinColumn(name = "tecnico_id", nullable = false)
    private Tecnicos tecnico;

    @ManyToOne
    @JoinColumn(name = "inventario_id", nullable = false)
    private Inventarios inventario;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuarioRegistro;
}
