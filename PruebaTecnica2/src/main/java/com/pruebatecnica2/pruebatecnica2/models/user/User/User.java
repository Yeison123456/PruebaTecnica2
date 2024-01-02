package com.pruebatecnica2.pruebatecnica2.models.user.User;

import com.pruebatecnica2.pruebatecnica2.models.user.Rol;
import com.pruebatecnica2.pruebatecnica2.models.user.tipoDoc;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Usuarios")
public class User{

    @Id
    @GeneratedValue
    private Integer idUsuario;
    private String primerNombreUsu;
    private String segundoNombreUsu;
    private String primerApellidoUsu;
    private String segundoApellidoUsu;
    private Long numDocUsu;
    private Long telefonoUsu;
    private String correoUsu;
    private String passwordUsu;
    private boolean estadoUsu;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idRolFK")
    private Rol rol;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtipoDocFK")
    private tipoDoc tipoDoc;


}