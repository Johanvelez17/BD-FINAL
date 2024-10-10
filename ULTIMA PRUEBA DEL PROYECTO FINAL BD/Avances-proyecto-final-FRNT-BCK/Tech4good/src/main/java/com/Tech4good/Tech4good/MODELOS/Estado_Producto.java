package com.Tech4good.Tech4good.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name = "estadoProducto")
public class Estado_Producto {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idEstado;
    private String nombreEstado;

}
