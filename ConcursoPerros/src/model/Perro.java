//De cada uno de los perros debemos guardar la siguiente lista de atributos:

//El nombre del perro.
//La edad (un entero, no hace falta que sea una fecha de nacimiento).
//El peso del perro.
//Si tienen o no tienen todas las vacunas requeridas.
//El Propietario del perro.
//La raza del mismo.
package model;

import java.util.Objects;

public class Perro implements Comparable <Perro>{
	
	private String nombre;
	private Integer edad;
	private Double peso;
	private boolean vacunas;
	private Propietario propietario;
	private String raza;
	
	public Perro() {
		setNombre("");
		setRaza("");
		setPropietario(new Propietario());
	}
	
	public Perro(String nombre, Propietario propietario, String raza) {
		setNombre(nombre);
		setEdad(0);
		setPeso(0.0);
		setVacunas(false);
		setPropietario(propietario);
		setRaza(raza);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public boolean isVacunas() {
		return vacunas;
	}
	public void setVacunas(boolean vacunas) {
		this.vacunas = vacunas;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int compareTo(Perro perro) {
		int comp;
		comp = getPeso().compareTo(perro.getPeso());
		return comp;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre, peso, propietario, raza, vacunas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perro other = (Perro) obj;
		return Objects.equals(raza, other.raza) ;
	}

	@Override
	public String toString() {
		return "Perro [getNombre()=" + getNombre() + ", getEdad()=" + getEdad() + ", getPeso()=" + getPeso()
				+ ", isVacunas()=" + isVacunas() + ", getPropietario()=" + getPropietario() + ", getRaza()=" + getRaza()
				+ "]";
	}
	
	
	
	

}
