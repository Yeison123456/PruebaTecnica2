package com.pruebatecnica2.pruebatecnica2.models.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name=" Ciudad")
public class Ciudad {

    @Id
    @GeneratedValue
    private Integer idCiudad;
    private String nombreCiudad;
    private boolean estadoCiudad;

}
