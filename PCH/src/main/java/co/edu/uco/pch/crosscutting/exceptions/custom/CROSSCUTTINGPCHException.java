package co.edu.uco.pch.crosscutting.exceptions.custom;

import co.edu.uco.pch.crosscutting.exceptions.PCHException;
import co.edu.uco.pch.crosscutting.exceptions.enums.Lugar;

public class CROSSCUTTINGPCHException extends PCHException{

	
	private static final long serialVersionUID = -7934939288202539017L;
	private static Lugar lugar = Lugar.CROSSCUTTING;

	public CROSSCUTTINGPCHException(final String mensajeTecnico) {
		super(mensajeTecnico, lugar);
	}
	
	
	
	
	
	public CROSSCUTTINGPCHException(final String mensajeTecnico, final String mensajeUsuario) {
		super(mensajeTecnico, mensajeUsuario, lugar);
	}





	public CROSSCUTTINGPCHException(final String mensajeTecnico, final String mensajeUsuario,
			final Throwable exceptionRaiz) {
		super(mensajeTecnico, mensajeUsuario,lugar, exceptionRaiz);
	}
	

}
