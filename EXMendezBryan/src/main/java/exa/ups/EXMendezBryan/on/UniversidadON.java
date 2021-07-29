package exa.ups.EXMendezBryan.on;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import exa.ups.EXMendezBryan.dao.UniversidadDAO;
import exa.ups.EXMendezBryan.modelo.Universidad;

@Stateless
public class UniversidadON {

	@Inject
	private UniversidadDAO daoUniversidad;

	public void insertUniversidad(Universidad universidad) throws Exception {

		daoUniversidad.insert(universidad);
	}

	public void updateUniversidad(Universidad universidad) throws Exception {

		daoUniversidad.update(universidad);
	}

	public void deleteUniversidad(int codigo) throws Exception {

		daoUniversidad.delete(codigo);
	}

	public List<Universidad> getUniversidads(String nombre) {

		return daoUniversidad.getUniversidades(nombre);
	}

	public List<Universidad> getUniversidades() {

		return daoUniversidad.getTodasUniversidades();
	}
	/*
	 * public List ListarUniversidad() throws Exception {
	 * 
	 * 
	 * //String cedula= Universidad.getCedula(); String nombre="Andres";
	 * List<Universidad> Universidad = daoUniversidad.getUniversidads(nombre);
	 * return Universidad; }
	 */

	public Universidad getUniversidadNombre(String nombre) {

		return daoUniversidad.readNombre(nombre);
	}

}
