package com.Tech4good.Tech4good.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name="ubicacionProducto")
public class Ubicacion_Producto {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long  idUbicacion;
    private String nombreUbicacion;

}
