package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "documento")
public class Documento {
    @Id
    private Long id;

    @Column(nullable = false, length = 255)
    private String nombre;

    @Column(nullable = false, length = 500)
    private String url;


}