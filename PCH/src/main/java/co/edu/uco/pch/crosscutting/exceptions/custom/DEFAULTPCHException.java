package co.edu.uco.pch.crosscutting.exceptions.custom;

import co.edu.uco.pch.crosscutting.exceptions.PCHException;
import co.edu.uco.pch.crosscutting.exceptions.enums.Lugar;

public class DEFAULTPCHException extends PCHException{

	
	private static final long serialVersionUID = -617265558543280265L;
	
	public DEFAULTPCHException(final String mensajeTecnico) {
		super(mensajeTecnico, Lugar.DEFAULT);
	}

	public DEFAULTPCHException(final String mensajeTecnico, final String mensajeUsuario, Lugar lugar, final Throwable exceptionRaiz) {
		super(mensajeTecnico, mensajeUsuario, Lugar.DEFAULT, exceptionRaiz);
		
	}
	
	
	

}
