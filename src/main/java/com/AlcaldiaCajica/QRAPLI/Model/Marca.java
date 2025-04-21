package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private MarcaPortatil marcaPortatil;

    @Embedded
    private MarcaServidor marcaServidor;

    @Embedded
    private MarcaImpresora marcaImpresora;

    @Embedded
    private MarcaSwitch marcaSwitch;

    @Embedded
    private MarcaRouter marcaRouter;

    @Embedded
    private MarcaUPS marcaUPS;

    @Embedded
    private MarcaAccessPoint marcaAccessPoint;

    @Embedded
    private MarcaComputadorEscritorio marcaComputadorEscritorio;

    @Embedded
    private MarcaEscaner marcaEscaner;

    @Embedded
    private MarcaTablet marcaTablet;

    @Embedded
    private MarcaCelular marcaCelular;

    @Embedded
    private MarcaMonitor marcaMonitor;

    @Embedded
    private MarcaTelevisor marcaTelevisor;

    @Embedded
    private MarcaProyector marcaProyector;

    @Embedded
    private MarcaPlotter marcaPlotter;

    @Embedded
    private MarcaNas marcaNas;

    @Embedded
    private MarcaTelefono marcaTelefono;

    @Embedded
    private MarcaRegulador marcaRegulador;

    @Embedded
    private MarcaFotocopiadora marcaFotocopiadora;

    // SUBMARCAS

    @Embeddable
    public static class MarcaPortatil {
        private String hp;
        private String dell;
        private String lenovo;
        private String asus;
        private String acer;
        private String toshiba;
        private String apple;
        private String msi;
        private String razer;
        private String huawei;
        private String samsung;
    }

    @Embeddable
    public static class MarcaServidor {
        private String hp;
        private String dell;
        private String lenovo;
    }

    @Embeddable
    public static class MarcaImpresora {
        private String hp;
        private String epson;
        private String brother;
        private String canon;
    }

    @Embeddable
    public static class MarcaSwitch {
        private String cisco;
        private String tpLink;
        private String ubiquiti;
        private String mikrotik;
    }

    @Embeddable
    public static class MarcaRouter {
        private String tpLink;
        private String cisco;
        private String huawei;
    }

    @Embeddable
    public static class MarcaUPS {
        private String apc;
        private String eaton;
        private String forza;
    }

    @Embeddable
    public static class MarcaAccessPoint {
        private String cisco;
        private String ubiquiti;
        private String tpLink;
    }

    @Embeddable
    public static class MarcaComputadorEscritorio {
        private String hp;
        private String dell;
        private String lenovo;
        private String asus;
    }

    @Embeddable
    public static class MarcaEscaner {
        private String hp;
        private String canon;
        private String epson;
    }

    @Embeddable
    public static class MarcaTablet {
        private String samsung;
        private String lenovo;
        private String apple;
    }

    @Embeddable
    public static class MarcaCelular {
        private String samsung;
        private String xiaomi;
        private String motorola;
        private String apple;
    }

    @Embeddable
    public static class MarcaMonitor {
        private String dell;
        private String samsung;
        private String lg;
    }

    @Embeddable
    public static class MarcaTelevisor {
        private String samsung;
        private String lg;
        private String sony;
    }

    @Embeddable
    public static class MarcaProyector {
        private String epson;
        private String benq;
        private String lg;
    }

    @Embeddable
    public static class MarcaPlotter {
        private String hp;
        private String canon;
    }

    @Embeddable
    public static class MarcaNas {
        private String synology;
        private String qnap;
    }

    @Embeddable
    public static class MarcaTelefono {
        private String cisco;
        private String avaya;
    }

    @Embeddable
    public static class MarcaRegulador {
        private String forza;
        private String apc;
    }

    @Embeddable
    public static class MarcaFotocopiadora {
        private String ricoh;
        private String sharp;
    }
    @OneToMany(mappedBy = "marca")
    private List<Inventarios> inventarios;
    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;


}
