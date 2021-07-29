package exa.ups.EXMendezBryan.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Carrera implements Serializable {

	@Id
	private int codigo;
	private String nombre;
	private String directorCarrera;
	
	@ManyToOne
	@JoinColumn(name = "universidad_id")
	private Universidad universidad;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirectorCarrera() {
		return directorCarrera;
	}
	public void setDirectorCarrera(String directorCarrera) {
		this.directorCarrera = directorCarrera;
	}
	public Universidad getUniversidad() {
		return universidad;
	}
	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}
	
	
}
