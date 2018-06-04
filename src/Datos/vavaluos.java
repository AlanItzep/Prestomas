/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Date;

/**
 *
 * @author SONY
 */
public class vavaluos {
    private int idavaluos;
    private String familia;
    private String subfamilia;
    private String marca;
    private String modelo;
    private Date fecha;
    private Double precio;
    private String descripcion;

    public vavaluos() {
    }

    public vavaluos(int idavaluos, String familia, String subfamilia, String marca, String modelo, Date fecha, Double precio, String descripcion) {
        this.idavaluos = idavaluos;
        this.familia = familia;
        this.subfamilia = subfamilia;
        this.marca = marca;
        this.modelo = modelo;
        this.fecha = fecha;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getIdavaluos() {
        return idavaluos;
    }

    public void setIdavaluos(int idavaluos) {
        this.idavaluos = idavaluos;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getSubfamilia() {
        return subfamilia;
    }

    public void setSubfamilia(String subfamilia) {
        this.subfamilia = subfamilia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
