package com.pruebatecnica2.pruebatecnica2.models.user;

import com.pruebatecnica2.pruebatecnica2.models.user.User.User;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Rol")
public class Rol {

    @Id
    @GeneratedValue
    private Integer idRol;
    private String nombreRol;
    private boolean estadoRol;

    // Relación muchos a uno con la entidad User
    @OneToMany(mappedBy = "idRolFK", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<User> users;
}