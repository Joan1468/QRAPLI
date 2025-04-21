package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Usuario {
    private Long id;
    private String nombre;
    private String username;
    private String password;
    private String correo;
    private String rol;
    @ManyToOne
    @JoinColumn(name = "id_tipo_vinculacion")
    private tipo_vinculacion Tipo_vinculacion;


    @ManyToOne
    @JoinColumn(name = "id_tipo_documento")
    private tipo_documento tipo_documento;
    //crear fk secretaria
    @ManyToOne
    @JoinColumn(name = "secretaria_id")
    private secretarias secretarias;

    @OneToOne
    @JoinColumn(name = "id_funcionario")
    private Funcionario funcionario;




        }
