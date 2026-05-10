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
public class Renta {
    private int idRenta;
    private int idCliente;
    private int idMaquinaria;
    private int idOperario;
    private Date fechaInicio;
    private Date fechaFin;
    private Double CostoTotal;

    public Renta() {
    }

    public Renta(int idRenta, int idCliente, int idMaquinaria, int idOperario, Date fechaInicio, Date fechaFin, Double CostoTotal) {
        this.idRenta = idRenta;
        this.idCliente = idCliente;
        this.idMaquinaria = idMaquinaria;
        this.idOperario = idOperario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.CostoTotal = CostoTotal;
    }

    public int getIdRenta() {
        return idRenta;
    }

    public void setIdRenta(int idRenta) {
        this.idRenta = idRenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdMaquinaria() {
        return idMaquinaria;
    }

    public void setIdMaquinaria(int idMaquinaria) {
        this.idMaquinaria = idMaquinaria;
    }

    public int getIdOperario() {
        return idOperario;
    }

    public void setIdOperario(int idOperario) {
        this.idOperario = idOperario;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getCostoTotal() {
        return CostoTotal;
    }

    public void setCostoTotal(Double CostoTotal) {
        this.CostoTotal = CostoTotal;
    }
    
}
