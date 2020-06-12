package com.example.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.Model.Persona;

@Component
public class ServicePersonas {
	private static Integer contador = 3;
	private static List<Persona> persona = new ArrayList<>();
	static {

		persona.add(new Persona(1, "Julian", "garcia"));
		persona.add(new Persona(2, "henry", "gacha"));
		persona.add(new Persona(3, "juan", "ramirez"));

	}

	public void agregarPersona(Persona persona) {
		persona.setId(++contador);
		this.persona.add(persona);

	}

	public List<Persona> buscarTodasPersonas() {

		return this.persona;

	}

	public void eliminarPersona(int id) {

		Iterator<Persona> itera = persona.iterator();
		while (itera.hasNext()) {

			Persona t = itera.next();
			if (t.getId() == id) {

				itera.remove();
			}

		}
	}

	public Persona buscarPersona(int id) {

		for (Persona e : this.persona) {

			if (e.getId() == id) {

				return e;

			}

		}
		return null;
	}

	public void update(Persona per) {
		for (int i = 0; i < this.persona.size(); i++) {

			if (this.persona.get(i).getId() == per.getId()) {

				Persona rem = this.persona.get(i);
				rem.setApeliido(per.getApeliido());
				this.persona.remove(i);
				this.persona.add(i, per);

			}

		}

	}

}
