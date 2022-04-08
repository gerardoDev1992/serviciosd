package com.evaluacion.servicios.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.evaluacion.servicios.entidades.OperacionSimple;
import com.evaluacion.servicios.entidades.service.OperacionSimpleService;


/**  OperacionSimpleController controladores para suma, resta, div, multi
 *  * @author Gerardo Leyva 
 * @version 1.0
*/


@RestController
public class OperacionSimpleController {
	
	@Autowired
	OperacionSimpleService servicioOperacionnumeros;
	
	OperacionSimple ope;
	
	@RequestMapping(value="suma",method = RequestMethod.GET)
	public @ResponseBody String suma(@RequestParam String entrada) {
		
		ope=new OperacionSimple();
		
		Map<String, Integer> map=convierteStringMap(entrada);
		ope.setNumeroA(map.get("\"Numero1\""));
		ope.setNumeroB(map.get("\"Numero2\""));
		servicioOperacionnumeros.hacerSuma(ope);
		
		return ope.ToString();
		
	}

	@RequestMapping(value="resta",method = RequestMethod.GET)
	public @ResponseBody String resta(@RequestParam String entrada) {
		
		ope=new OperacionSimple();
		
		Map<String, Integer> map=convierteStringMap(entrada);
		ope.setNumeroA(map.get("\"Numero1\""));
		ope.setNumeroB(map.get("\"Numero2\""));
		servicioOperacionnumeros.hacerResta(ope);
		
		return ope.ToString();
		
	}
	
	
	@RequestMapping(value="multiplicacion",method = RequestMethod.GET)
	public @ResponseBody String multiplicacion(@RequestParam String entrada) {
		
		ope=new OperacionSimple();
		
		Map<String, Integer> map=convierteStringMap(entrada);
		ope.setNumeroA(map.get("\"Numero1\""));
		ope.setNumeroB(map.get("\"Numero2\""));
		servicioOperacionnumeros.hacerMultiplicacion(ope);
		
		return ope.ToString();
		
	}
		
	
	@RequestMapping(value="division",method = RequestMethod.GET)
	public @ResponseBody String division(@RequestParam String entrada) {
		
		ope=new OperacionSimple();
		
		Map<String, Integer> map=convierteStringMap(entrada);
		ope.setNumeroA(map.get("\"Numero1\""));
		ope.setNumeroB(map.get("\"Numero2\""));
		servicioOperacionnumeros.hacerDivision(ope);
		
		return ope.ToString();
		
	}
		
	
	
	public Map<String, Integer> convierteStringMap(String cadena){
		Map<String, Integer> map = new HashMap<String, Integer>();
		cadena=cadena.replace("{", "").replace("}", "");
		String[] pairs = cadena.split(",");
		for (int i=0;i<pairs.length;i++) {
		    String pair = pairs[i];
		    String[] keyValue = pair.split("=");
		    map.put(keyValue[0], Integer.valueOf(keyValue[1]));
		}
		return map;
	}
	

}
