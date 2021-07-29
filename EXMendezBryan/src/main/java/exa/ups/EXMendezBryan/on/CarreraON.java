package exa.ups.EXMendezBryan.on;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import exa.ups.EXMendezBryan.dao.CarreraDAO;
import exa.ups.EXMendezBryan.dao.UniversidadDAO;
import exa.ups.EXMendezBryan.modelo.Carrera;
import exa.ups.EXMendezBryan.modelo.Universidad;
import exa.ups.EXMendezBryan.services.CarreraTemp;
import exa.ups.EXMendezBryan.services.Mensaje;




@Stateless
public class CarreraON {

	@Inject
	private CarreraDAO daoCarrera;
	
	@Inject
	private UniversidadDAO daoUniversidad;
	

	public void insertCarrera(Carrera carrera) throws Exception {
			
		 daoCarrera.insert(carrera);	
	}

	public void updateCarrera(Carrera carrera) throws Exception {
		
		
		daoCarrera.update(carrera);
	}
	
	public void deleteCarrera(int codigo) throws Exception {
		
		
		daoCarrera.delete(codigo);
	}
	
	public List<Carrera> getCarreras() {
		
		//if(!this.validaCedula(Carrera.getCedula()))
			//throw new Exception("Cedula incorrecta");
		//Carrera per= daoCarrera.read("0102930888");
		
		return daoCarrera.getCarreras("%");
	}
	
	/*
	public List ListarCarrera() throws Exception {
		
		
		//String cedula= Carrera.getCedula();
		String nombre="Andres";
		List<Carrera> Carrera = daoCarrera.getCarreras(nombre);
		return Carrera;
	}
	*/
	
	public Mensaje anadirCarrera(CarreraTemp carrera) {
		Mensaje msj= new Mensaje();
		Carrera ca = new Carrera();
		String nombreU=carrera.getUniversidad();
		Universidad uni= new Universidad();
		List<Universidad> universidades = daoUniversidad.getUniversidades(nombreU);
		for(Universidad elemento:universidades) {
			System.out.println(elemento +"Elemento");
			uni.setCodigo(elemento.getCodigo());
			uni.setNombre(elemento.getNombre());
			uni.setDireccion(elemento.getDireccion());
			uni.setTelefono(elemento.getTelefono());
		}
		System.out.println(uni.getNombre() +"Objeto");
		//Carrera ca= new Carrera();
		//ca.setCodigo(carrera.getCodigo());
		//ca.setNombre(carrera.getNombre());
		//ca.setUniversidad(uni);
		if(uni == null) {
			msj.setCodigo(1);
			msj.setDescripcion("Error");
		}else if(uni != null) {
			msj.setCodigo(2);
			msj.setDescripcion("Ok Uni");
		}
		//ca.set;
		 
		/*
		if(p == null) {
			msj.setCodigo("1");
			msj.setDescripcion("Error");
		}else if(p != null) {
			msj.setCodigo("2");
			msj.setDescripcion("OK, tiene datos");
		}
		*/
		
		return msj;
	}
}
