package co.edu.uco.dto;

import java.util.UUID;

public final class DepartamentoDTO {
	private UUID id;
	private String nombre;
	private PaisDTO pais;
	

	public DepartamentoDTO() {
		super();

	}
	public DepartamentoDTO(final UUID id, final String nombre,final PaisDTO pais) {
		setId(id);
		setNombre(nombre);
		setPais(pais);
	}
	private UUID getId() {
		return id;
	}
	private void setId(UUID id) {
		this.id = id;
	}
	private final String getNombre() {
		return nombre;
	}
	private  final void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private  PaisDTO getPais() {
		return pais;
	}
	private final void setPais(PaisDTO pais) {
		this.pais = pais;
	}
	

}
