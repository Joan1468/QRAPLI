package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class tipo_equipo {
    private int id_tipo_equipo;
    private String portatil;
    private String computadorEscritorio;
    private String impresora;
    private String servidor;
    private String Switch;
    private String accessPoint;
    private String router;
    private String ups;
    private String escaner;
    private String plotter;
    private String proyectorVideoBeam;
    private String telefono;
    private String tablet;
    private String fotocopiadora;
    private String nas;
    private String monitor;
    private String televisor;
    private String reguladorVoltaje;
    private String celular;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre; // Ej: portátil, impresora, etc.

    @OneToMany(mappedBy = "tipoEquipo")
    private List<Inventarios> Inventarios;

} //Sin relacion  foranea
