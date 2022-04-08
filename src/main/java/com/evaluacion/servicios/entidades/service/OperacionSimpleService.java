package com.evaluacion.servicios.entidades.service;

import org.springframework.stereotype.Service;

import com.evaluacion.servicios.entidades.OperacionSimple;
import com.evaluacion.servicios.impl.OperacionSimpleImpl;
import com.evaluacion.servicios.repository.OperacionSimpleRepository;


/**  OperacionSimpleService
 *  * @author Gerardo Leyva 
 * @version 1.0
*/


@Service
public class OperacionSimpleService {

	
	 OperacionSimpleRepository repositorio=new OperacionSimpleImpl();
	 
	 public OperacionSimple hacerSuma(OperacionSimple ope ) {		 
		 
		 ope.setResultado(ope.getNumeroA()+" + "+ope.getNumeroB()+" = "+repositorio.suma(ope.getNumeroA(), ope.getNumeroB()));
		 ope.setCodigo("200");
		 ope.setMensaje("Operacion Exitosa");
		 return ope;
		 
	 }
	 public OperacionSimple hacerResta(OperacionSimple ope ) {		 
		 
		 ope.setResultado(ope.getNumeroA()+" - "+ope.getNumeroB()+" = "+repositorio.resta(ope.getNumeroA(), ope.getNumeroB()));
		 ope.setCodigo("200");
		 ope.setMensaje("Operacion Exitosa");
		 return ope;
		 
	 }
	 public OperacionSimple hacerMultiplicacion(OperacionSimple ope ) {		 
		 
		 ope.setResultado(ope.getNumeroA()+" * "+ope.getNumeroB()+" = "+repositorio.multiplicacion(ope.getNumeroA(), ope.getNumeroB()));
		 ope.setCodigo("200");
		 ope.setMensaje("Operacion Exitosa");
		 return ope;
		 
	 }
		
	 public OperacionSimple hacerDivision(OperacionSimple ope ) {		 
		 if(ope.getNumeroB()==0) {
			 ope.setResultado(ope.getNumeroA()+" / "+ope.getNumeroB());
			 ope.setCodigo("400");
			 ope.setMensaje("No se puede dividir entre cero");
		 }
		 else {
			 ope.setResultado(ope.getNumeroA()+" / "+ope.getNumeroB()+" = "+repositorio.division(ope.getNumeroA(), ope.getNumeroB()));
			 ope.setCodigo("200");
			 ope.setMensaje("Operacion Exitosa");
		 }
		 return ope;
		 
	 }
	
	 
		
	
	
	
	
}
