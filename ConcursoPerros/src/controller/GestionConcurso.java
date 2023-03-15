// Para ello crearemos una clase llamada Concurso en donde guardaremos todos los perros del concurso, el nombre del concurso y la localidad en la que se va a celebrar.
//Como los concursos de los perros son por razas dentro de la clase Concurso tendremos que crear la estructura de datos necesaria para acceder mediante el nombre de la raza, que es único, al conjunto de perros de dicha raza.
//La clase Concurso tiene que tener los siguientes métodos.
//Un método addDog() que recibe como parámetros la raza y un perro y que añadirá a la estructura de datos ese perro en la raza determinada o mostrará un mensaje de error en caso de que estemos intentando introducir en la raza un perro que no sea de dicha raza.
//El método disqualifyDog() que recibe como parámetro un perro y lo elimina del concurso borrándolo de la estructura de datos que contienen los datos de los perros participantes organizados por razas. En caso de ese perro no esté escrito deberá mostrar el siguiente mensaje "Perro no inscrito".
//El método ownerDogs() que mostrará por pantalla todos los perros de un dueño determinado (sea de la raza que sean). Este método recibe como parámetro el número de socio de la Sociedad Canina y mostrará el mensaje "Este socio no tiene perros inscritos" en caso de que el socio no tenga ningún perro en este concurso.
//El método perrosporPeso() que mostrará la lista de perros de una raza, que se recibe como parámetro, ordenados por peso de manera decreciente.
//El método perrosporEdad() que mostrará la lista de perros de una raza, que se recibe como parámetro, ordenados por edad de manera decreciente.
package controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import model.Perro;
import model.Propietario;

public class GestionConcurso {

//	Un método addDog() que recibe como parámetros la raza y un perro y que añadirá a la estructura de datos ese perro en la raza determinada o mostrará un mensaje de error en caso de que estemos intentando introducir en la raza un perro que no sea de dicha raza.

	private String nombreConcurso;
	private String localidad;
	private Map<String, List<Perro>> perrosPorRaza;

	public GestionConcurso(String nombre, String localidad) {
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
	
	
	
	
	// El método disqualifyDog() que recibe como parámetro un perro y lo elimina del
	// concurso borrándolo de la estructura de datos que contienen los datos de los
	// perros participantes organizados por razas. En caso de ese perro no esté
	// escrito deberá mostrar el siguiente mensaje "Perro no inscrito".

	public void disqualifyDog(Perro perro) {
		boolean remove = false;
		for (List<Perro> perros : perrosPorRaza.values()) {
			if (perros.remove(perro)) {
				remove = true;
			}
		}
		if (!remove) {
			System.out.println("Perro no inscrito");
		}

	}
	
	
	

	// El método ownerDogs() que mostrará por pantalla todos los perros de un dueño
	// determinado (sea de la raza que sean). Este método recibe como parámetro el
	// número de socio de la Sociedad Canina y mostrará el mensaje "Este socio no
	// tiene perros inscritos" en caso de que el socio no tenga ningún perro en este
	// concurso.

	public List<Perro> ownerDogs(Integer numSocio) {
		
		List<Perro> listadoPerros = new ArrayList<Perro>();
		for (List<Perro> lista : perrosPorRaza.values()) {
			for (Perro perro : lista) {
				if (perro.getPropietario().getNumSocio().equals(numSocio)) {
					listadoPerros.add(perro);
				} 
			}
		}
		return listadoPerros;
	}

	// El método perrosporPeso() que mostrará la lista de perros de una raza, que se
	// recibe como parámetro, ordenados por peso de manera decreciente.
	public void perrosporPeso(String raza) {

		if (!perrosPorRaza.containsKey(raza)) {
			System.out.println("El perro no existe");
		} else {
			List<Perro> perros = perrosPorRaza.get(raza);
			Collections.sort(perros, Comparator.comparingDouble(Perro::getPeso).reversed());
			for (Perro perro : perros) {
				System.out.println(perro);
			}

		}

	}

	// El método perrosporEdad() que mostrará la lista de perros de una raza, que se
	// recibe como parámetro, ordenados por edad de manera decreciente.

	public void perrosporEdad(String raza) {
		if (!perrosPorRaza.containsKey(raza)) {
			System.out.println("El perro no existe");
		} else {
			List<Perro> perros = perrosPorRaza.get(raza);
			Collections.sort(perros, Comparator.comparingInt(Perro::getEdad).reversed());
			for (Perro perro : perros) {
				System.out.println(perro);
			}
		}

	}

}
