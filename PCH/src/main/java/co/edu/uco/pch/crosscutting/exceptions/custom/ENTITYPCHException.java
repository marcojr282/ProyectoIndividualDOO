package co.edu.uco.pch.crosscutting.exceptions.custom;

import co.edu.uco.pch.crosscutting.exceptions.PCHException;
import co.edu.uco.pch.crosscutting.exceptions.enums.Lugar;

public class ENTITYPCHException extends PCHException{
	
	private static final long serialVersionUID = 8189605716414165929L;

	public ENTITYPCHException(final String mensajeTecnico) {
		super(mensajeTecnico, Lugar.ENTITY);
		
	}
	
	public ENTITYPCHException(final String mensajeTecnico,final String mensajeUsuario, Lugar lugar, final Throwable exceptionRaiz) {
		super(mensajeTecnico, mensajeUsuario, Lugar.ENTITY, exceptionRaiz);
		
	}
	
	

}
