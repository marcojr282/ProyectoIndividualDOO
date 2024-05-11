package co.edu.uco.pch.data.dao.entity;

import co.edu.uco.pch.entity.CiudadEntity;

public interface CiudadDAO extends CreateDAO<CiudadEntity>, RetrieveDAO<CiudadEntity>, UpdateDAO<CiudadEntity>{

	void crear(CiudadEntity data);


}
