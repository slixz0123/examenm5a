package com.camilo.app.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;



@Entity
@Table(name = "vehiculo")
public class vehiculo {

	
	private static final long serialVersionUID = -8743356424363980633L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_vehiculo;
	
	
	private String placa;
	private String color;
	private int numchasis;
	private int numllantas;
	private String modelo;
	private int costo;
	private String observacion;
	
	
	public long getId_vehiculo() {
		return id_vehiculo;
	}
	public void setId_vehiculo(long id_vehiculo) {
		this.id_vehiculo = id_vehiculo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumchasis() {
		return numchasis;
	}
	public void setNumchasis(int numchasis) {
		this.numchasis = numchasis;
	}
	public int getNumllantas() {
		return numllantas;
	}
	public void setNumllantas(int numllantas) {
		this.numllantas = numllantas;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	
	
	
	

	
	
	
	
}
