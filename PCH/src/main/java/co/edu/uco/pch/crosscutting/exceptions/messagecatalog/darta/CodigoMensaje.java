package co.edu.uco.pch.crosscutting.exceptions.messagecatalog.darta;



import static co.edu.uco.pch.crosscutting.helpers.TextHelper.concatenate;
import static co.edu.uco.pch.crosscutting.helpers.TextHelper.UNDERLINE;


public enum CodigoMensaje {
	
	M000001(TipoMensaje.TECNICO,CategoriaMensaje.ERROR,"00001",true),
	M000002(TipoMensaje.USUARIO,CategoriaMensaje.ERROR,"00002",true),
	M000003(TipoMensaje.TECNICO,CategoriaMensaje.ERROR,"00003",true),
	M000004(TipoMensaje.TECNICO,CategoriaMensaje.ERROR,"00004",true),
	M000005(TipoMensaje.TECNICO,CategoriaMensaje.ERROR,"00005",true),
	M000006(TipoMensaje.TECNICO,CategoriaMensaje.ERROR,"00006",true),
	M000007(TipoMensaje.USUARIO,CategoriaMensaje.EXITO,"00007",false),
	M000008(TipoMensaje.USUARIO,CategoriaMensaje.EXITO,"00008",true);
	
	private TipoMensaje tipo;
	private CategoriaMensaje categoria;
	private String codigo;
	private boolean base;
	
	private CodigoMensaje(final TipoMensaje tipo, final CategoriaMensaje categoria, 
			final String codigo, final boolean base) {
		setTipo(tipo);
		setCategoria(categoria);
		setCodigo(codigo);
		setBase(base);

	}

	public final boolean isBase() {
		return base;
	}
	public final TipoMensaje getTipo() {
		return tipo;
	}

	private final void setTipo(final TipoMensaje tipo) {
		this.tipo = tipo;
	}

	public final CategoriaMensaje getCategoria() {
		return categoria;
	}

	private final void setCategoria(final CategoriaMensaje categoria) {
		this.categoria = categoria;
	}

	public final String getCodigo() {
		return codigo;
	}

	private final void setCodigo(final String codigo) {
		this.codigo = codigo;
	}
	
	private final void setBase(boolean base) {
		this.base = base;
	}
	
	public final String getIdentificador() {
		return concatenate(getTipo().name(),UNDERLINE,
				getCategoria().name(),UNDERLINE, getCodigo());
	}
	
	public static void main(String[] args) {
		System.out.println(M000001.getIdentificador());
	}
	
}