package co.edu.uco.pch.data.dao.entity.concrete;

import java.sql.Connection;

class SqlConnection {
	private Connection conexion;
	

	protected SqlConnection(Connection conexion) {
		super();
		this.conexion = conexion;
	}

	protected final Connection getConexion() {
		return conexion;
	}

	private final void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
	

}
