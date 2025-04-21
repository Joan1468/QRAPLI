package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Mantenimiento {
    @Id
    private int id_mantenimientos;
    private String descripcion;
    private String observaciones;
    private String correctivo;
    private String preventivo;

    @ManyToOne
    private Inventarios inventarios;
    @ManyToOne
    @JoinColumn(name = "id_tecnico")
    private Tecnicos tecnicos;




}
