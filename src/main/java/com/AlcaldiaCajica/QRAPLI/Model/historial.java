package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class historial {
    private Long id;
    private LocalDate fecha_Asignacion;


    @ManyToOne
    @JoinColumn(name = "inventario_id")
    private Inventarios inventario;

    @ManyToOne
    @JoinColumn(name = "id_funcionario")
    private Funcionario funcionario;


}
