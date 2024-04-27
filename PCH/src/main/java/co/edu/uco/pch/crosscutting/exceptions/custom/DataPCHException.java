package co.edu.uco.pch.crosscutting.exceptions.custom;

import co.edu.uco.pch.crosscutting.exceptions.PCHException;
import co.edu.uco.pch.crosscutting.exceptions.enums.Lugar;

public final class DataPCHException extends PCHException{

	
	private static final long serialVersionUID = 1L;

	public DataPCHException(String mensajeUsuario, Lugar lugar) {
		super(mensajeUsuario, Lugar.DATA);
		
	}
	
	public DataPCHException(final String mensajeTecnico, final String mensajeUsuario, , throwable ) {
		super(mensajeTecnico, mensajeUsuario, Lugar.DATA, exceptionRaiz);
	}
	
	

}
