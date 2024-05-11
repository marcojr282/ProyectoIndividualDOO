package co.edu.uco.pch.crosscutting.exceptions.messagecatalog.darta;

public final class Mensaje {
	
	private CodigoMensaje codigo;
	private CategoriaMensaje categoria;
	private TipoMensaje tipo;
	private String contenido;
	private boolean base;
	
	private final void setCodigo(CodigoMensaje codigo) {
		this.codigo = codigo;
	}
	
	private final void setContenido(final String contenido) {
		this.contenido = contenido;
	}
	public Mensaje(final CodigoMensaje codigo,final  String contenido) {
		setCodigo(codigo);
		setContenido(contenido);
	}
	
	public final boolean esBase() {
		return getCodigo().isBase();
	}
	
	private final CodigoMensaje getCodigo() {
		return codigo;
	}
	public final CategoriaMensaje getCategoria() {
		return categoria;
	}
	public final TipoMensaje getTipo() {
		return getCodigo().getTipo();
	}
	public final String getContenido() {
		return contenido;
	}
	
	public final String getIdentificador() {
		return getCodigo().getIdentificador();
	}
	
	
	

}