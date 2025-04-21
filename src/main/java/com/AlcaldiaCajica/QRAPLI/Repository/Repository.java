package com.AlcaldiaCajica.QRAPLI.Repository;

import com.AlcaldiaCajica.QRAPLI.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Usuario, Long> {
    // Aquí puedes agregar métodos personalizados si los necesitas más adelante
}
