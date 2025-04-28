package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "asignacion") // Correcto: nombre en minúscula para estándar SQL
public class Asignacion {

    @Id
    @Column(name = "id_ubicacion")
    private int idUbicacion;

    @Column(nullable = false, length = 255)
    private String ubicacion;


}
