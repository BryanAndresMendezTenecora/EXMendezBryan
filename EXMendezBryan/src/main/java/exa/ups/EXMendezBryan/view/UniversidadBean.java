package exa.ups.EXMendezBryan.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import exa.ups.EXMendezBryan.modelo.Universidad;
import exa.ups.EXMendezBryan.on.UniversidadON;

@Named
@RequestScoped
public class UniversidadBean {
	
	private Universidad newPersona = new Universidad();
	private List<Universidad> universidades;
	
	
	
	public Universidad getNewPersona() {
		return newPersona;
	}


	public void setNewPersona(Universidad newPersona) {
		this.newPersona = newPersona;
	}


	public List<Universidad> getUniversidades() {
		return universidades;
	}


	public void setUniversidades(List<Universidad> universidades) {
		this.universidades = universidades;
	}


	@Inject
	private UniversidadON universidadON;
	
	
	@PostConstruct
	public void init() {
		universidades=universidadON.getUniversidades();
		System.out.println(universidades);
	}
	

}
