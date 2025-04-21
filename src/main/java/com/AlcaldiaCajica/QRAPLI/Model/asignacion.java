package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class asignacion {
    @Id
    @GeneratedValue
    private int id_ubicacion;
    private int id_tipo_equipo;
    private int id_Equipo;
    private int id_secretaria;
    private int id_funcionario;
    private int id_tipo_documento;
    private String ubicacion;


    @ManyToOne
    @JoinColumn(name = "tipo_equipo_id")
    private tipo_equipo tipoEquipo;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Inventarios equipo;

    @ManyToOne
    @JoinColumn(name = "secretaria_id")
    private secretarias secretaria;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario Funcionario;

    @ManyToOne
    @JoinColumn(name = "tipo_documento_id")
    private tipo_documento tipo_documento;

    @OneToOne
    private historial historial;

}
