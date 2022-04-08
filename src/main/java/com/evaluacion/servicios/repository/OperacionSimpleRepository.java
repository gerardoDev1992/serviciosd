package com.evaluacion.servicios.repository;




/** La clase operacion debe implentar operaciones basicas
 * @author Gerardo Leyva 
 * @version 1.0
*/

public interface OperacionSimpleRepository {
	
	public int suma(int numero1,int numero2);
	public int resta(int numero1,int numero2);
	public int division(int numero1,int numero2);
	public int multiplicacion(int numero1,int numero2);

	

}
