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
@Table(name = "historial")
public class Historial {
    @Id
    private Long id;
    private LocalDate fecha_Asignacion;


    @ManyToOne
    @JoinColumn(name = "inventario_id")
    private Inventarios inventario;

    @ManyToOne
    @JoinColumn(name = "id_funcionario")
    private Funcionario funcionario;


}
