package com.evaluacion.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.evaluacion.servicios.entidades.Denominacion;
import com.evaluacion.servicios.entidades.Rap;
import com.evaluacion.servicios.entidades.Denominacion.Denom;

@SpringBootApplication
public class ServiciosApplication {
	
	public static List<Rap> raps=new ArrayList<Rap>();
	
	public static void main(String[] args) {
		SpringApplication.run(ServiciosApplication.class, args);
	}
	/*
    public void run(String... args) throws Exception {
    	Denom moneda;
		moneda = Denom.Moneda;
		Denom billete;
		billete = Denom.Moneda;
    	Rap r=new Rap();
    	r.setIdRap("0001");
    	
    	List<Denominacion> deno=new ArrayList<Denominacion>();
    	Denominacion d=new Denominacion();
    	d.setCantidad(1);
    	d.setDenominacion(100.0);
    	d.setTipoDenominacion(billete);
    	deno.add(d);
    	
    	Denominacion dd=new Denominacion();
    	dd.setCantidad(2);
    	dd.setDenominacion(200.0);
    	dd.setTipoDenominacion(billete);
    	deno.add(dd);
    	
    	Denominacion ddd=new Denominacion();
    	ddd.setCantidad(20);
    	ddd.setDenominacion(25.0);
    	ddd.setTipoDenominacion(moneda);
    	deno.add(ddd);
   
    }*/
}
