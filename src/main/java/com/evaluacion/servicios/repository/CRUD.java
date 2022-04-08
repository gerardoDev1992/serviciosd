package com.evaluacion.servicios.repository;




/** Representa a CRUP
 * @author Gerardo Leyva 
 * @version 1.0
*/

///Patron DAO

public interface CRUD<T> {
	
	public String busca(T p);
	

}
