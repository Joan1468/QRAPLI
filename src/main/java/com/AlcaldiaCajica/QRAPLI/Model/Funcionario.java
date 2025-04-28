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
@Table(name = "funcionario") // Mejor en minúscula para Supabase
public class Funcionario {

    @Id
    private int id; // Estándar de convención -> ID sencillo

    @Column(nullable = false, length = 100)
    private String area; // Nombre del área en la que trabaja el funcionario

    // Relaciones
    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private List<Inventarios> inventarios;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private List<Asignacion> asignaciones;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL)
    private List<Historial> historiales; // Nombre más correcto en plural
}
