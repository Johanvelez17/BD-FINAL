package com.Tech4good.Tech4good.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name = "tipoProducto")
public class Tipo_Producto {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idTipo;
    private String nombreTipo;


}
