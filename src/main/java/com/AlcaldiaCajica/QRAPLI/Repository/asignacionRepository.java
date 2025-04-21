package com.AlcaldiaCajica.QRAPLI.Repository;

import com.AlcaldiaCajica.QRAPLI.Model.asignacion;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;
import java.util.Optional;
public interface AsignacionRepository {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ubicacion;
    private int id_tipo_equipo;
    private int id_Equipo;
    private int id_secretaria;
    private int id_funcionario;
    private int id_tipo_documento;
    private String ubicacion;
 //METODOS


    List<asignacion> findByUbicacion(String ubicacion);

    List<asignacion> findByIdFuncionario(int funcionario_id);

    List<asignacion> findByIdTipoEquipo(int idTipoEquipo);

    List<asignacion> findByIdSecretaria(int idSecretaria);

    List<asignacion> findByIdEquipo(int idEquipo);

}
