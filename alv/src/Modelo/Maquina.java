/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author Danny
 */
public class Maquina {
    private int idMaquina;
    private String tipoMaquina;
    private String marca;
    private int modelo;
    private Date fechaAdquisicion;
    private String estatus;
    private Double costoRenta;

    public Maquina() {
    }

    public Maquina(int idMaquina, String tipoMaquina, String marca, int modelo, Date fechaAdquisicion, String estatus, Double costoRenta) {
        this.idMaquina = idMaquina;
        this.tipoMaquina = tipoMaquina;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaAdquisicion = fechaAdquisicion;
        this.estatus = estatus;
        this.costoRenta = costoRenta;
    }

    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }

    public String getTipoMaquina() {
        return tipoMaquina;
    }

    public void setTipoMaquina(String tipoMaquina) {
        this.tipoMaquina = tipoMaquina;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public Double getCostoRenta() {
        return costoRenta;
    }

    public void setCostoRenta(Double costoRenta) {
        this.costoRenta = costoRenta;
    }

    
}
