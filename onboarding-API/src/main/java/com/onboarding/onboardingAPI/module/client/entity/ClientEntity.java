package com.onboarding.onboardingAPI.module.client.entity;

import com.onboarding.onboardingAPI.commons.constans.DatabaseConstant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table( name = DatabaseConstant.CLIENT_TABLE)
@AllArgsConstructor
@NoArgsConstructor
public class ClientEntity {

    @Id
    @Column( name = "id" )
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Integer Id;

    @Column( name = "id_usuario")
    private String idUsuario;

    @Column( name = "nombre" )
    private String nombre;

    @Column( name = "apellido_materno" )
    private String apellidoMaterno;

    @Column( name = "apellido_paterno" )
    private String apellidoPaterno;

    @Column( name = "edad" )
    private String edad;

    @Column( name = "telefono" )
    private String telefono;

    @Column( name = "email" )
    private String email;

    @Column( name = "calle" )
    private String calle;

    @Column( name = "numero_exterior" )
    private String numeroExterior;

    @Column( name = "numero_interior" )
    private String numeroInterior;

    @Column( name = "estado" )
    private String estado;

    @Column( name = "municipio" )
    private String municipio;

    @Column( name = "ciudad" )
    private String ciudad;

    @Column( name = "colonia" )
    private String colonia;

    @Column( name = "codigo_postal" )
    private String codigo_postal;

    @Column( name = "link_direccion" )
    private String linkDireccion;

    @Column( name = "monto_credito" )
    private String montoCredito;

    @Column( name = "taza_credito" )
    private String tazaCredito;

    @Column( name = "meses_credito" )
    private String mesesCredito;

}
