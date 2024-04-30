package co.edu.uco.pch.crosscutting.exceptions.custom;

import co.edu.uco.pch.crosscutting.exceptions.PCHException;
import co.edu.uco.pch.crosscutting.exceptions.enums.Lugar;

public final class DataPCHException extends PCHException{

	
	private static final long serialVersionUID = 1L;


	public DataPCHException(final String mensajeUsuario) {
		super(mensajeUsuario, Lugar.DATA);
		
	}
	
	public DataPCHException(final String mensajeTecnico, final String mensajeUsuario,Lugar lugar, final Throwable excepcionRaiz) {
		super(mensajeTecnico, mensajeUsuario, Lugar.DATA, excepcionRaiz);
	}
	
	
}
