package com.Tech4good.Tech4good.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name="Inventario")
public class Inventario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idProducto;
    private Long idTipo;
    private Long idEstado;
    private Long idUbicacion;
    private String marca;
    private String modelo;
    private String descripcion;


}
