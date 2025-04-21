package com.AlcaldiaCajica.QRAPLI.Repository;

import com.AlcaldiaCajica.QRAPLI.Model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

    // Buscar por área (por nombre de área del funcionario)
    List<Funcionario> findByArea(String area);

    // Buscar por ID exacto
    Funcionario findByIdFuncionario(int idFuncionario);

    // Buscar funcionarios que tengan asignaciones (funcionarios con al menos una asignación)
    List<Funcionario> findByAsignacionesIsNotNull();

    // Buscar por número mínimo de asignaciones (si implementas lógica personalizada)
    // List<Funcionario> findByAsignacionesSizeGreaterThan(int count); <-- Esto requiere @Query

}
