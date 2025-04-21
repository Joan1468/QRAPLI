package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Inventarios {
    private Long id_inventario;
    private String Serial;
    private LocalDate fechaAdquisicion;



    @ManyToOne
    private tipo_equipo tipo_Equipo;

    @ManyToOne
    private Funcionario funcionario;
    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;
    @OneToOne(mappedBy = "Serial")
    private Equipo equipo;
    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario Funcionario;

    @OneToMany(mappedBy = "inventario")
    private List<mantenimientos> mantenimientos;

    @OneToOne(mappedBy = "equipo")
    private hv_equipos id_hojas_vida;

    @OneToMany(mappedBy = "inventario", cascade = CascadeType.ALL)
    private List<historial> historial;

    @OneToOne(mappedBy = "inventario", cascade = CascadeType.ALL)
    private hv_equipos hojaVida;


}
