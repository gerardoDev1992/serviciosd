package com.evaluacion.servicios.entidades.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.evaluacion.servicios.ServiciosApplication;
import com.evaluacion.servicios.entidades.Denominacion;
import com.evaluacion.servicios.entidades.Rap;
import com.evaluacion.servicios.entidades.Denominacion.Denom;
import com.evaluacion.servicios.impl.RapImpl;
import com.evaluacion.servicios.repository.CRUD;

/**  RapService sercios para los Raps 
 *  *  * @author Gerardo Leyva 
 * @version 1.0
*/


@Service
public class RapService {
	
	CRUD<Rap> rapRepository=new RapImpl();
	
	
	public String enviaNivelesEfectivo(Rap p) {
		
		return rapRepository.busca(p);
	}
	
	
	public String convierteCadenaLista(String a) {
		String c = "", b = "";

		b = a.split("denominaciones")[0];

		b = b.replace("{", "").replace("}", "").replace("[", "").replace("]", "").replace("\"", "");
		c = a.split("denominaciones")[1].replace("{[", "").replace("]}", "");
		String[] valores = b.split(",");

		int i = 0;
		Map<String, String> map = new HashMap<String, String>();
		for (i = 0; i < valores.length; i++) {
			String v = valores[i];
			String[] llaves = v.split("=");
			map.put(llaves[0].replace(" ", "").replace("\n", "").replace("\r", ""), llaves[1].replace(" ", "").replace("\n", "").replace("\r", ""));
		}

		Rap rap = new Rap();
		
		rap.setIdRap(map.get("idRap"));
		rap.setMonto(Double.valueOf(map.get("monto")));
		rap.setNombre(map.get("nombre"));
		
		List<Denominacion> ds = new ArrayList<Denominacion>();
		int j = 0;
		Double denominacion=0.0;
		String[] denominaciones = c.split("}");
		for (i = 0; i < denominaciones.length - 1; i++) {
			String deno = denominaciones[i];
		

			Denominacion g = new Denominacion();

			
			String hg[] = deno.split("=");

			
			
			
			g.setCantidad(Integer.valueOf(hg[2].split(",")[0]));

			if (hg[3].contains("Moneda")) {
				Denom tps;
				tps = Denom.Moneda;
				g.setTipoDenominacion(tps);
			}
			if (hg[3].contains("Billete")) {
				Denom tps;
				tps = Denom.Billete;
				g.setTipoDenominacion(tps);
			}
			
			denominacion=Double.valueOf(hg[1].split(",")[0].replace("\"", ""));
			
			if(g.getTipoDenominacion().equals(Denom.Billete) && (denominacion.equals(20.0) || denominacion.equals(50.0) ||denominacion.equals(100.0) || 
					denominacion.equals(200.0) || denominacion.equals(500.0) || denominacion.equals(1000.0))) {
				g.setDenominacion(denominacion);
			}
			else {
				g.setDenominacion(0.0);
			}
			if(g.getTipoDenominacion()==Denom.Moneda && (denominacion.equals(1.0) || denominacion.equals(2.0) ||denominacion.equals(5.0) || 
					denominacion.equals(10.0) || denominacion.equals(20.0)) ) {
				g.setDenominacion(denominacion);
			}else {
				g.setDenominacion(0.0);
			}

			ds.add(g);
		}
		Double vr=0.0;
		for (Denominacion denominacionS : ds) {
			vr=denominacionS.getCantidad()*denominacionS.getDenominacion()+vr;						
		}
		
		
		if(vr.equals(rap.getMonto())) {
			rap.setMensaje("Operación realizada Exitosamente");
			rap.setCodigo(200);
			rap.setDonominaciones(ds);
		}else {
			rap.setMensaje("Error en las cuentas o valores no aceptados ");
			rap.setCodigo(400);
		}
		
		ServiciosApplication.raps.add(rap);
		
		return rap.toString();
	}
	
	
	
	


}
