package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.*;

import java.util.List;

public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreEquipo;


    @ManyToOne
    @JoinColumn(name = "tipo_equipo_id")
    private tipo_equipo tipoEquipo;

    @ManyToOne
    @JoinColumn(name = "estado_id")
    private Estado estado;

    @ManyToOne
    @JoinColumn(name = "marca_portatil_id", nullable = true)
    private Marcaportatil marcaPortatil;

    @ManyToOne
    @JoinColumn(name = "marca_servidor_id", nullable = true)
    private MarcaServidor marcaServidor;

    // Repite lo mismo para otras marcas (MarcaImpresora, MarcaRouter, etc.)

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario; // quién lo registró

    @OneToOne(mappedBy = "equipo", cascade = CascadeType.ALL)
    private hojas_vida_equipos hojaVida;

    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
    private List<asignacion> asignaciones;

    // Si lo usas para generar PDF con QR
    private String qrCodeUrl;
}
