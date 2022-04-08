package com.evaluacion.servicios.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class OperacionSimple {
	@JsonIgnore
	private int numeroA;
	@JsonIgnore
	private int numeroB;
	private String codigo;
	private String mensaje;
	private String resultado;;
	
	
	public int getNumeroA() {
		return numeroA;
	}
	public void setNumeroA(int numeroA) {
		this.numeroA = numeroA;
	}
	public int getNumeroB() {
		return numeroB;
	}
	public void setNumeroB(int numeroB) {
		this.numeroB = numeroB;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	public String ToString() {
		
		return "{ \"Código\"="+this.codigo+","
				+ " \"Mensaje\"= \""+this.mensaje+"\"  "
						+ "\"Resultado\" \""+this.resultado+"\" }";
	}
	
	
		

}
