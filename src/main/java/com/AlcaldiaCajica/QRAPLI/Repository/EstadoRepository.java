package com.AlcaldiaCajica.QRAPLI.Repository;

import com.AlcaldiaCajica.QRAPLI.Model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

    // Buscar por el campo "Bueno"
    Estado findByBueno(String bueno);

    // Buscar por el campo "Regular"
    Estado findByRegular(String regular);

    // Buscar por el campo "Malo"
    Estado findByMalo(String malo);

    // Buscar por ID
    Estado findByIdEstado(int idEstado);
}
