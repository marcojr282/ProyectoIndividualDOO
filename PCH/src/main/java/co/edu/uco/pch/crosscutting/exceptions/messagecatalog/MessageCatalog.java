package co.edu.uco.pch.crosscutting.exceptions.messagecatalog;

import co.edu.uco.pch.crosscutting.exceptions.messagecatalog.darta.CodigoMensaje;
import co.edu.uco.pch.crosscutting.exceptions.messagecatalog.darta.Mensaje;

public interface MessageCatalog {
	
	void inicializar();
	
	String obtenerContenidoMensaje(final CodigoMensaje codigo, String ... parametros );
	
	Mensaje obtenerMensaje(final CodigoMensaje codigo, String ... parametros );

	

	
}
