package com.evaluacion.servicios.impl;

import com.evaluacion.servicios.ServiciosApplication;
import com.evaluacion.servicios.entidades.Rap;
import com.evaluacion.servicios.repository.CRUD;

/** Implementacion de Rap usando Dao 
 *  * @author Gerardo Leyva 
 * @version 1.0
*/


public class RapImpl implements CRUD<Rap>{

	@Override
	public String busca(Rap p) {
		String buscar=p.getIdRap();
		
		for (Rap g : ServiciosApplication.raps) {
			if(g.getIdRap().equals(buscar)) {
				g.setCodigo(200);
				g.setMensaje("Operación realizada exitosamente");			
				p=g;				
				break;
			}
			
		}				
		return p.Encontrado();
	}







}
