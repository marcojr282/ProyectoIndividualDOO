package co.edu.uco.pch.crosscutting.exceptions.messagecatalog.impl;

import java.util.HashMap;
import java.util.Map;

import co.edu.uco.pch.crosscutting.exceptions.custom.CROSSCUTTINGPCHException;
import co.edu.uco.pch.crosscutting.exceptions.messagecatalog.MessageCatalog;
import co.edu.uco.pch.crosscutting.exceptions.messagecatalog.darta.CodigoMensaje;
import co.edu.uco.pch.crosscutting.exceptions.messagecatalog.darta.Mensaje;
import co.edu.uco.pch.crosscutting.helpers.ObjectHelper;

public final class MessageCatalogBase implements MessageCatalog{
	
	private final Map<String, Mensaje> mensajes = new HashMap<> ();

	@Override
	public final void inicializar() {
		mensajes.clear();
		mensajes.put(CodigoMensaje.M000001.getIdentificador(),
				new Mensaje(CodigoMensaje.M000001, "El codigo del mensaje que se quiere obtener del catalogo de mensajes llego nulo"));
		mensajes.put(CodigoMensaje.M000002.getIdentificador(), 
				new Mensaje(CodigoMensaje.M000002, "Se ha presentado un problema tratando de llevar a cabo la operacion deseada"));
		mensajes.put(CodigoMensaje.M000003.getIdentificador(), 
				new Mensaje(CodigoMensaje.M000003, "El identificador del mensaje \"${1}\" que se intento obtener, no esta en el catalogo de mensajes base"));
		mensajes.put(CodigoMensaje.M000004.getIdentificador(), 
				new Mensaje(CodigoMensaje.M000004, "El mensaje con identificador \"${1}\" que se intento obtener, no esta configurado para recibir en el catalogo de mensajes base"));
		mensajes.put(CodigoMensaje.M000005.getIdentificador(), 
				new Mensaje(CodigoMensaje.M000005, "El mensaje con identificador \"${1}\" que se intento obtener, no esta configurado para recibir en el catalogo de mensajes externo"));
		mensajes.put(CodigoMensaje.M000006.getIdentificador(), 
				new Mensaje(CodigoMensaje.M000006, "El identificador del mensaje \"${1}\" que se intento obtener, no esta en el catalogo de mensajes externo"));
	}

	@Override
	public final String obtenerContenidoMensaje(final CodigoMensaje codigo,final String... parametros) {
		return obtenerMensaje(codigo, parametros).getContenido();
	}

	@Override
	public final Mensaje obtenerMensaje(final CodigoMensaje codigo, final String... parametros) {
		
		if(ObjectHelper.getObjectHelper().isNull(codigo)){
			var mensajeUsuario = obtenerContenidoMensaje(CodigoMensaje.M000002);
			var mensajeTecnico = obtenerContenidoMensaje(CodigoMensaje.M000001);
			throw new CROSSCUTTINGPCHException(mensajeTecnico, mensajeUsuario);
		}
		if(!codigo.isBase()) {
			var mensajeUsuario = obtenerContenidoMensaje(CodigoMensaje.M000002);
			var mensajeTecnico = obtenerContenidoMensaje(CodigoMensaje.M000004,codigo.getIdentificador());
			throw new CROSSCUTTINGPCHException(mensajeTecnico, mensajeUsuario);
		}
		if(!mensajes.containsKey(codigo.getIdentificador())) {
			var mensajeUsuario = obtenerContenidoMensaje(CodigoMensaje.M000002);
			var mensajeTecnico = obtenerContenidoMensaje(CodigoMensaje.M000003,codigo.getIdentificador());
			throw new CROSSCUTTINGPCHException(mensajeTecnico, mensajeUsuario);
		}
		return mensajes.get(codigo.getIdentificador());
	}

}