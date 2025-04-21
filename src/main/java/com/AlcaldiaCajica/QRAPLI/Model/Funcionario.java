package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Funcionario {
    @Id
    private int id_funcionario;
    private String Area;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private List<Inventarios> Inventarios;

    // Relación con Asignación (uno a muchos)
    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private List<asignacion> asignaciones;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private List<historial> historial;


}
