package com.AlcaldiaCajica.QRAPLI.Controller;

import com.AlcaldiaCajica.QRAPLI.Model.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Usuarios")
public class UsuarioController {
    @GetMapping(path = "/")
    public List<Usuario> getNames() {
        return List.of(
                new Usuario(
                        2541L,
                        "Juan Nunez",
                        "jfnunez",
                        "1234", // Esto es solo de prueba, luego debe ir encriptado
                        "jfnunez@ucundinamarca.edu.co",
                        "Funcionario de planta"
                )
        );
    }
}
