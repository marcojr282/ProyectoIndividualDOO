package co.edu.uco.pch.crosscutting.exceptions.messagecatalog;

import co.edu.uco.pch.crosscutting.exceptions.custom.CROSSCUTTINGPCHException;
import co.edu.uco.pch.crosscutting.exceptions.messagecatalog.darta.CodigoMensaje;
import co.edu.uco.pch.crosscutting.exceptions.messagecatalog.darta.Mensaje;
import co.edu.uco.pch.crosscutting.exceptions.messagecatalog.impl.MessageCatalogBase;
import co.edu.uco.pch.crosscutting.exceptions.messagecatalog.impl.MessageCatalogExternalService;
import co.edu.uco.pch.crosscutting.helpers.ObjectHelper;

public final class MessageCatalogStrategy {
	
	private static final MessageCatalog base = new MessageCatalogBase();
	private static final MessageCatalog externalService = new MessageCatalogExternalService();
	
	
	static {
		inicializar();
	}
	
	private MessageCatalogStrategy() {
		super();
		
	}
	
	public static void inicializar() {
		base.inicializar();
		externalService.inicializar();		

	}
	private static final MessageCatalog getStrategy(final boolean isBase) {
		return isBase ? base : externalService;
	}
	
	public static final Mensaje getMensaje(final CodigoMensaje codigo, 
			final String...parametros) {
		
		if(ObjectHelper.getObjectHelper().isNull(codigo)){
			var mensajeUsuario = MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M000002);
			var mensajeTecnico =  MessageCatalogStrategy.getContenidoMensaje(CodigoMensaje.M000001);
			throw new CROSSCUTTINGPCHException(mensajeTecnico, mensajeUsuario);
		}
		
		return getStrategy(codigo.isBase()).obtenerMensaje(codigo, parametros);
	}
	
	public static final String getContenidoMensaje(final CodigoMensaje codigo, 
			final String...parametros) {
		return getMensaje(codigo, parametros).getContenido();
	}
	
	public static void main(String[] args) {
		System.out.println(getContenidoMensaje(CodigoMensaje.M000007));
	}

}
