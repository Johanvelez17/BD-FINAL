package com.Tech4good.Tech4good.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name="Donantes")
public class Donantes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String nombreUsuario;
    private String numeroDocumento;
    private String correoElectronicoUsuario;
    private String contraseñaUsuario;
    private String telefonoUsuario;
    private String tipoDeUsuario;

    public Donantes() {
    }

    public Donantes(Long idUsuario, String nombreUsuario, String numeroDocumento, String correoElectronicoUsuario, String contraseñaUsuario, String telefonoUsuario, String tipoDeUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.numeroDocumento = numeroDocumento;
        this.correoElectronicoUsuario = correoElectronicoUsuario;
        this.contraseñaUsuario = contraseñaUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCorreoElectronicoUsuario() {
        return correoElectronicoUsuario;
    }

    public void setCorreoElectronicoUsuario(String correoElectronicoUsuario) {
        this.correoElectronicoUsuario = correoElectronicoUsuario;
    }

    public String getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    public void setContraseñaUsuario(String contraseñaUsuario) {
        this.contraseñaUsuario = contraseñaUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }
}
