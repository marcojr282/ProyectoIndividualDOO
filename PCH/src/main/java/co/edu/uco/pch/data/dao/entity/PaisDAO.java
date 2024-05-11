package co.edu.uco.pch.data.dao.entity;

import java.util.List;

import co.edu.uco.pch.entity.PaisEntity;

public interface PaisDAO extends RetrieveDAO<PaisEntity>{

	List<PaisEntity> consultar(PaisEntity data);
	
	
}
