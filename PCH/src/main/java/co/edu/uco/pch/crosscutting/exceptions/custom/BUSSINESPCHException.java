package co.edu.uco.pch.crosscutting.exceptions.custom;

import co.edu.uco.pch.crosscutting.exceptions.PCHException;
import co.edu.uco.pch.crosscutting.exceptions.enums.Lugar;

public class BUSSINESPCHException extends PCHException {


	private static final long serialVersionUID = 239915054915721141L;

	public BUSSINESPCHException(final String mensajeTecnico) {
		super(mensajeTecnico, Lugar.BUSSINES);
		
	}
	
	public BUSSINESPCHException(final String mensajeTecnico, final String mensajeUsuario, Lugar lugar, final Throwable exceptionRaiz) {
		super(mensajeTecnico, mensajeUsuario, Lugar.BUSSINES, exceptionRaiz);
		
	}
	
	

}
