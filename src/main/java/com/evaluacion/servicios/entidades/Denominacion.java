package com.evaluacion.servicios.entidades;



/** Representa Denominacion de monedas
 * @author Gerardo Leyva 
 * @version 1.0
*/

public class Denominacion {
	public enum Denom {
	    Billete,
	    Moneda,    
	  }

	private Double denominacion;
	private int cantidad;
	private Denom tipoDenominacion;
	
	
	public Double getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(Double denominacion) {
		this.denominacion = denominacion;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Denom getTipoDenominacion() {
		return tipoDenominacion;
	}
	public void setTipoDenominacion(Denom tipoDenominacion) {
		this.tipoDenominacion = tipoDenominacion;
	}

	
	

}
