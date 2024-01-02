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
@Table(name=" tipoDocumento")
public class tipoDoc {

    @Id
    @GeneratedValue
    private Integer idTipoDoc;
    private String nombreTipoDoc;
    private boolean estadoTipoDoc;

    // Relación muchos a uno con la entidad User
    @OneToMany(mappedBy = "idtipoDocFK", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<User> users;
}
