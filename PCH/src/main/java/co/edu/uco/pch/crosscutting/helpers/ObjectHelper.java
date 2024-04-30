package co.edu.uco.pch.crosscutting.helpers;

public class ObjectHelper {
	
	private static final ObjectHelper INSTANCE = new ObjectHelper();

	
	private ObjectHelper() {
		super();
	}
	
	public static ObjectHelper getObjectHelper() {
		return INSTANCE;
	}
	
	public <O> boolean isNull(O objeto) {
		return objeto == null;
	}
	public <O> O getDefaultValue (O objeto, O valorDefecto) {
		return isNull (objeto) ? valorDefecto : objeto;
	}

	

	
	
	

}
