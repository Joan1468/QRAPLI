package com.AlcaldiaCajica.QRAPLI.Repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public interface UsuarioRepository {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private

}
