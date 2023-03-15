//De los propietarios de los perros deberemos guardar a su vez los siguiente datos:
//
//El nombre.
//Los apellidos.
//El número de socio de la Sociedad Canina Mundial.
//El país de origen.
//
package model;

import java.util.Objects;

public class Propietario {
	
	private String nombre;
	private String apellidos;
	private Integer numSocio;
	private String pais;
	
	public Propietario() {
		setNombre("");
		setApellidos("");
		setNumSocio(0);
		setPais("");
	}
	
	
	public Propietario(String nombre, String apellidos, Integer numSocio, String pais) {
		setNombre(nombre);
		setApellidos(apellidos);
		setNumSocio(numSocio);
		setPais(pais);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Integer getNumSocio() {
		return numSocio;
	}
	public void setNumSocio(Integer numSocio) {
		this.numSocio = numSocio;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}


	@Override
	public String toString() {
		return "Propietario [getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getNumSocio()="
				+ getNumSocio() + ", getPais()=" + getPais() + "]";
	}

	
	
	
	

}
