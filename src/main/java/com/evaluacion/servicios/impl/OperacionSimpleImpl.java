package com.evaluacion.servicios.impl;

import com.evaluacion.servicios.repository.OperacionSimpleRepository;

public class OperacionSimpleImpl implements OperacionSimpleRepository{

	@Override
	public int suma(int numero1, int numero2) {

		return numero1+numero2;
	}

	@Override
	public int resta(int numero1, int numero2) {
		// TODO Auto-generated method stub
		return numero1-numero2;
	}

	@Override
	public int division(int numero1, int numero2) {
		// TODO Auto-generated method stub
		return numero1/numero2;
	}

	@Override
	public int multiplicacion(int numero1, int numero2) {
		// TODO Auto-generated method stub
		return numero1*numero2;
	}
	

}
