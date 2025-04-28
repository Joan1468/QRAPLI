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
@Table(name = "estado") // Minúscula para la tabla
public class Estado {

    @Id
    private int id; // ID genérico, más limpio

    @Column(nullable = false, length = 100)
    private String descripcion; // Ejemplo: Bueno, Regular o Malo

    // Relaciones
    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
    private List<Inventarios> inventarios; // Referencia correcta (minúscula en el atributo)
}
