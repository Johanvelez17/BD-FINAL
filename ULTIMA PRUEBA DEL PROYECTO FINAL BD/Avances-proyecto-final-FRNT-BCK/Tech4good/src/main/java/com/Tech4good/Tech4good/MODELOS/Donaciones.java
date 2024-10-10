package com.Tech4good.Tech4good.MODELOS;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Donaciones")
public class Donaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDonacion;
    private Long idUsuario;
    private Long idProducto;
    private LocalDate fechaDonacion;
    private String estadoDonacion;


}
