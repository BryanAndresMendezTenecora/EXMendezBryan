package exa.ups.EXMendezBryan.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Universidad implements Serializable {

	@Id
	private int codigo;
	private String nombre;
	private String direccion;
	private String telefono;
	
	@OneToMany(mappedBy = "universidad", cascade = CascadeType.ALL)
	private List<Carrera> carrera;
	
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public List<Carrera> getCarrera() {
		return carrera;
	}
	public void setCarrera(List<Carrera> carrera) {
		this.carrera = carrera;
	}
	
	
	
	
}
