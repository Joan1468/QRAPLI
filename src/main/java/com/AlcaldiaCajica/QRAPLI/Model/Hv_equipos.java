package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "hv_equipos")
public class Hv_equipos {
    @Id
    private Long id;

    @Column(name = "fecha_compra")
    private LocalDate fechaCompra;

    @Column(name = "garantia_hasta")
    private LocalDate garantiaHasta;

    @Column(length = 500)
    private String especificaciones;

    @Column(length = 500)
    private String accesorios;

    @OneToOne
    @JoinColumn(name = "inventario_id")
    private Inventarios inventario;

    @OneToMany(mappedBy = "hojaVida", cascade = CascadeType.ALL)
    private List<Documento> documentos;
}



