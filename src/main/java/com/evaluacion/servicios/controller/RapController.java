package com.evaluacion.servicios.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.evaluacion.servicios.entidades.Rap;
import com.evaluacion.servicios.entidades.service.RapService;

/**  RapController controladores para enviaNivelesEfectivo y  consultaNivelesEfectivoxRAP
 *  * @author Gerardo Leyva 
 * @version 1.0
*/

@RestController
public class RapController {
	
	@Autowired
	RapService service;
	
	
	@RequestMapping(value="enviaNivelesEfectivo",method = RequestMethod.POST)
	public @ResponseBody String enviaNivelesEfectivo(@RequestParam String entrada) {										
		return service.convierteCadenaLista(entrada);
	}

	
	@RequestMapping(value="consultaNivelesEfectivoxRAP",method = RequestMethod.POST)
	public @ResponseBody String consultaNivelesEfectivoxRAP(@RequestParam String idRap) {
		Rap p=new Rap();		
		p.setIdRap(idRap.split("=")[1].replace("{", "").replace("}", "").replace("\"", "").replace("\n", "").replace("\r", ""));					
		return service.enviaNivelesEfectivo(p);
	}
	
	

}
