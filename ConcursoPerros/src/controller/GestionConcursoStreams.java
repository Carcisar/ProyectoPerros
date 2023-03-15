package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Perro;

public class GestionConcursoStreams {
	
	

	private String nombreConcurso;
	private String localidad;
	private Map<String, List<Perro>> perrosPorRaza;

	public GestionConcursoStreams(String nombre, String localidad) {
		setNombreConcurso(nombre);
		setLocalidad(localidad);
		this.perrosPorRaza = new HashMap<>();
	}

	public String getNombreConcurso() {
		return nombreConcurso;
	}

	public void setNombreConcurso(String nombreConcurso) {
		this.nombreConcurso = nombreConcurso;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Map<String, List<Perro>> getPerrosPorRaza() {
		return perrosPorRaza;
	}

	public void setPerrosPorRaza(Map<String, List<Perro>> perrosPorRaza) {
		this.perrosPorRaza = perrosPorRaza;
	}
	
	
	
	
	public void addDog(String raza, Perro perro) {
		if (!perro.getRaza().equals(raza)) {
			System.out.println("Error: el perro no pertenece a la raza indicada");
		}else {
			if (!perrosPorRaza.containsKey(raza)) {
				perrosPorRaza.put(raza, new ArrayList<>());
			} 
			perrosPorRaza.get(raza).add(perro);
		}
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
