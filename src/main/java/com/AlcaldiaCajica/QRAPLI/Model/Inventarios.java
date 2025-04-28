package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "inventarios")
public class Inventarios {
    @Id
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String serial;

    @Column(nullable = false, length = 100)
    private String modelo;

    @Column(name = "fecha_adquisicion")
    private LocalDate fechaAdquisicion;


    @Column(length = 500)
    private String observaciones;

    @ManyToOne
    @JoinColumn(name = "marca_id", nullable = false)
    private Marca marca;

    @ManyToOne
    @JoinColumn(name = "estado_id", nullable = false)
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "tipo_equipo_id", nullable = false)
    private Tipo_equipo tipoEquipo;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;

    @OneToOne(mappedBy = "inventario", cascade = CascadeType.ALL)
    private Hv_equipos hojaVida;

    @OneToMany(mappedBy = "inventario")
    private List<Mantenimiento> mantenimientos;

    @OneToOne(mappedBy = "equipo")
    private Asignacion asignacion;
}