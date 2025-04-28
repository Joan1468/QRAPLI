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
@Table(name = "equipo") // Estándar en minúsculas para base de datos
public class Equipo {

    @Id
    private Long id;

    @Column(nullable = false, length = 255)
    private String nombreEquipo;

    // Relaciones
    @ManyToOne
    @JoinColumn(name = "tipo_equipo_id", nullable = false)
    private Tipo_equipo tipoEquipo;

    @ManyToOne
    @JoinColumn(name = "estado_id", nullable = false)
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario; // Quién registró el equipo

    @OneToOne(mappedBy = "equipo", cascade = CascadeType.ALL)
    private Hv_equipos hojaVida; // Hoja de vida asociada (correcto en mayúscula inicial)

    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
    private List<Asignacion> asignaciones; // Todas las asignaciones que tiene el equipo

    // Para el QR
    @Column(length = 500)
    private String qrCodeUrl;
}
