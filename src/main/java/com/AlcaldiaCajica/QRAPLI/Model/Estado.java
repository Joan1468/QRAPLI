package com.AlcaldiaCajica.QRAPLI.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Estado {
private int id_Estado;
private String Bueno;
private String Regular;
private String Malo;

    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
    private List<Inventarios> Inventarios;
}
