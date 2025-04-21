package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class hv_equipos {

    @Id


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int id_hv_equipos;
    private int id_equipo;
    private String descripcion;
    private LocalDate fechaIngreso;
    private String observaciones;
    private String rutaManualPDF;

    //RELACIONES

    @OneToOne
    @JoinColumn(name = "Inventario_pdf")
    private Inventarios Inventarios;

    @OneToMany
    private mantenimientos mantenimientos;




}
