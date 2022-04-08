package com.evaluacion.servicios.entidades;

import java.util.List;


public class Rap {

	private String idRap;
	private String nombre;
	private Double monto;
	private String mensaje;
	private int codigo;
	private List<Denominacion> denominaciones;



	public String getIdRap() {
		return idRap;
	}

	public void setIdRap(String idRap) {
		this.idRap = idRap;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public List<Denominacion> getDonominaciones() {
		return denominaciones;
	}

	public void setDonominaciones(List<Denominacion> denominaciones) {
		this.denominaciones = denominaciones;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String toString() {
				
		return "{ \"codigo\"="+this.codigo+", \"mensaje\"=\""+this.mensaje+"\" }";
	}
	
	public String Encontrado() {
		String dem="";
		for(Denominacion p:this.denominaciones) {
			dem= "{\"denominacion\" =\""+p.getDenominacion()+"\", \"cantidad\"="+p.getCantidad()+", \"tipo_denominacion\"=\""+p.getTipoDenominacion()+"\"},"+dem;
			
		}
		
		
		return "{ \"codigo\"="+this.codigo+", \"mensaje\"=\""+this.mensaje+"\","
				+ " \"idRap\"= \""+this.idRap+"\", \"nombre\"= \""+this.nombre+"\", \"monto\"="+this.monto+""
						+ "\"denominaciones\": {["
							+dem 
						+ "]} }";
	}





}
