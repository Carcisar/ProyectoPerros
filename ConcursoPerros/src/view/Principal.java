////Queremos desarrollar una aplicación para la gestión de un concurso canino internacional. Para ello crearemos una clase llamada Concurso en donde guardaremos todos los perros del concurso, el nombre del concurso y la localidad en la que se va a celebrar.
//
//Como los concursos de los perros son por razas dentro de la clase Concurso tendremos que crear la estructura de datos necesaria para acceder mediante el nombre de la raza, que es único, al conjunto de perros de dicha raza.
//Como cuando hay un concurso las inscripciones de los mismos se realizan en varios días y para no perder todos los inscritos debemos también de tener dos métodos en la clase:
//cargarPerros() que leerá todos los perros desde el fichero binario "perros.dat" y los colocará en el conjunto de perros de su raza.
//guardarPerros() que escribirá todos los perros cargados en el fichero "perros.dat". Estos perros serán guardados de manera individual sin tener que estar, en esa estructura, organizados por raza.
//Usar dicha clase y todos sus métodos en la la clase Main. Deberéis tener, al menos, 3 razas, 10 perros y 3 dueños (combinados de la manera que queráis).


package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import controller.GestionConcurso;
import model.Perro;
import model.Propietario;

public class Principal {
	
	private static GestionConcurso gc = new GestionConcurso("Concurso de saltos", "Sevilla");

	public static void main(String[] args) {
		

	Map<String, Perro> pr = new HashMap<String, Perro>();
		
		Propietario p1 = new Propietario("Manuel", "Sanchez", 001, "Alemania");
		Propietario p2 = new Propietario("Juana","Luardo",002,"París");
		Propietario p3 = new Propietario("Maria","Arena",003,"España");
		
		Perro pe1 = new Perro("Nico",p1,"Bodeguero Andaluz");
		Perro pe2 = new Perro("Leo",p2,"Husky Siberiano");
		Perro pe3 = new Perro("Lua",p3,"Pastor Belga");
		Perro pe4 = new Perro("Petunia",p1,"Chihuahua");
		Perro pe5 = new Perro("Hugo",p2,"Bichón Maltes");
		Perro pe6 = new Perro("Bolivar",p3,"Bodeguero Andaluz");
		Perro pe7 = new Perro("Coco",p1,"Husky Siberiano");
		Perro pe8 = new Perro("Bony",p2,"Pastor Belga");
		Perro pe9 = new Perro("Froy",p3,"Chihuahua");
		Perro pe10 = new Perro("Susan",p1,"Chihuahua");
		Perro pe11 = new Perro("Cory",p1,"Pastor Belga");
		Perro pe12 = new Perro("Nube",p2,"Bodeguero Andaluz");
		
		
		gc.addDog(pe1.getRaza(), pe1);
		gc.addDog(pe2.getRaza(), pe2);
		gc.addDog(pe3.getRaza(), pe3);
		gc.addDog(pe4.getRaza(), pe4);
		gc.addDog(pe5.getRaza(), pe5);
		gc.addDog(pe6.getRaza(), pe6);
		gc.addDog(pe7.getRaza(), pe7);
		gc.addDog(pe8.getRaza(), pe8);
		gc.addDog(pe9.getRaza(), pe9);
		gc.addDog(pe10.getRaza(), pe10);
		gc.addDog(pe11.getRaza(), pe11);
		gc.addDog(pe12.getRaza(), pe12);
		
		showDogs(002);
		
		
		
		
	}
	
	private static void showDogs(Integer numSocio) {
		List<Perro> perros = gc.ownerDogs(numSocio);
		if (perros.size()==0) {
			System.out.println("No hay perros inscritos");
		}else {
			for (Perro perro : perros) {
				System.out.println(perro);
			}
			
		}
	}
	
	
	
	

}
