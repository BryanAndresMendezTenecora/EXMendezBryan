package exa.ups.EXMendezBryan.services;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import exa.ups.EXMendezBryan.modelo.Carrera;
import exa.ups.EXMendezBryan.modelo.Universidad;
import exa.ups.EXMendezBryan.on.CarreraON;
import exa.ups.EXMendezBryan.on.UniversidadON;



@Path("servicios")
public class ServicioRS {

	@Inject
	private CarreraON carreraON;
	
	@Inject
	private UniversidadON universidadON;
	
	@PUT
	@Path("/registrarUniversidad")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Mensaje registrarUniversidad(Universidad universidad) {
		Mensaje msj = new Mensaje();
		try {
			universidadON.insertUniversidad(universidad);
			msj.setCodigo(1);
			msj.setDescripcion("OK");
			return msj;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			msj.setCodigo(1);
			msj.setDescripcion("Error");
			return msj;
		}
	}
	
	
	
	@PUT
	@Path("/registrarCarrera")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Mensaje registrarCarrera(CarreraTemp carrera) {
		//Mensaje msj= new Mensaje();
		Mensaje msj= carreraON.anadirCarrera(carrera);
	
		/*
		try {
			carreraON.insertCarrera(ca);
			msj.setCodigo(1);
			msj.setDescripcion("Ok con Objeto");
			return msj;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			msj.setCodigo(2);
			msj.setDescripcion("Error");
			return msj;
		}
		*/
		return msj;
		
	}
}
