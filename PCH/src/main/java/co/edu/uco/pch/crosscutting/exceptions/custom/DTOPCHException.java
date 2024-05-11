package co.edu.uco.pch.crosscutting.exceptions.custom;

import co.edu.uco.pch.crosscutting.exceptions.PCHException;
import co.edu.uco.pch.crosscutting.exceptions.enums.Lugar;

public class DTOPCHException extends PCHException {


	private static final long serialVersionUID = 121432733060246699L;
	
	public DTOPCHException(final String mensajeTecnico) {
		super(mensajeTecnico, Lugar.DTO);
		
	}
	public DTOPCHException(final String mensajeTecnico, final String mensajeUsuario, Lugar lugar, final Throwable exceptionRaiz) {
		super(mensajeTecnico, mensajeUsuario, Lugar.DTO, exceptionRaiz);
		
	}
	

}
