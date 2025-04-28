package com.AlcaldiaCajica.QRAPLI.Repository;

import com.AlcaldiaCajica.QRAPLI.Model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;




    @Repository
    public interface EquipoRepository extends JpaRepository<Equipo, Long> {

        // Buscar por nombre del equipo
        List<Equipo> findByNombreEquipoContainingIgnoreCase(String nombreEquipo);

        // Buscar por tipo de equipo
        List<Equipo> findByTipoEquipo_Id(Long idTipoEquipo);

        // Buscar por estado del equipo
        List<Equipo> findByEstado_Id(Long idEstado);

        // Buscar por marca portatil
        List<Equipo> findByMarcaPortatil_Id(Long idMarcaPortatil);

        // Buscar por usuario que lo registró
        List<Equipo> findByUsuario_Id(Long idUsuario);

        // Buscar por código QR
        Equipo findByQrCodeUrl(String qrCodeUrl);

        // Contar equipos por estado
        long countByEstado_Id(Long idEstado);

        // Filtrar por tipo, estado y marca
        List<Equipo> findByTipoEquipo_IdAndEstado_IdAndMarcaPortatil_Id(Long tipoId, Long estadoId, Long marcaId);
    }

