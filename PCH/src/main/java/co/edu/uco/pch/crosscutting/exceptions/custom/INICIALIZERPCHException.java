package co.edu.uco.pch.crosscutting.exceptions.custom;

import co.edu.uco.pch.crosscutting.exceptions.PCHException;
import co.edu.uco.pch.crosscutting.exceptions.enums.Lugar;

public class INICIALIZERPCHException extends PCHException{

	
	private static final long serialVersionUID = 6691397887309440709L;

	public INICIALIZERPCHException(final String mensajeTecnico) {
		super(mensajeTecnico, Lugar.INICIALIZER);
	}
	
	public INICIALIZERPCHException(final String mensajeTecnico, final String mensajeUsuario, Lugar lugar, final Throwable exceptionRaiz) {
		super(mensajeTecnico, mensajeUsuario, Lugar.INICIALIZER, exceptionRaiz);
	}
	

}
