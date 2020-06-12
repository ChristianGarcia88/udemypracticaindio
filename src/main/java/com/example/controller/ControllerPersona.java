package com.example.controller;

import java.net.Authenticator.RequestorType;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Model.Persona;
import com.example.service.ServicePersonas;

@Controller
public class ControllerPersona {
	@Autowired
	private ServicePersonas service;

	@GetMapping("/inicio")
	public String mostrarRegistro(  Model m) {
		Persona per= new Persona();

		
			m.addAttribute("persona", per);
		
		return "registro";

	}

	@RequestMapping(value = "/inicio", method = {RequestMethod.POST})
	public String ejecucionRegistro( Model m, @Valid @ModelAttribute("persona") Persona persona, BindingResult result) {
		
		

		if (result.hasErrors()) {
			return "registro";
		}
		
	
		if(persona.getId()==null || persona.getId().equals(" ")) {service.agregarPersona(persona);}
		else if(persona.getId()!= null) {service.update(persona);}
		
		
		return "redirect:/lista-personas";

	}
	
	@GetMapping("/lista-personas")
	public  String  listaPersona(Model model){
		
		model.addAttribute("lista", service.buscarTodasPersonas());
		
		return "pagina-Lista";
		
	}

	
	
	@GetMapping("/eliminar")
	public  String  listaPersona(@RequestParam("id") Integer id , Model model){
		
		service.eliminarPersona(id);
		
		return "redirect:/lista-personas";
		
	}
	
	
	@GetMapping("/actualizar")
	public  String actualizar( @RequestParam("id") Integer id , Model m) {
		
	Persona per=	service.buscarPersona(id);
		m.addAttribute("persona", per);
		return "registro";
		
	}
	//de las dos maneras se puede +
/*	@PostMapping("/actualizar")
	public  String actualizarDesdeForm( @Valid @ModelAttribute("persona") Persona persona, BindingResult result) {
		
	service.update(persona);
		return "redirect:/lista-personas";
		
	}*/
}
