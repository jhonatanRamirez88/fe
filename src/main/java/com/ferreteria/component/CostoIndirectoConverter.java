package com.ferreteria.component;

import org.springframework.stereotype.Component;
import com.ferreteria.entity.CostoIndirecto;
import com.ferreteria.model.CostoIndirectoModel;

@Component("costoIndirectoConverter")
public class CostoIndirectoConverter {
	public CostoIndirecto convertCostoIndirectoModel2CostoIndirecto(CostoIndirectoModel costoIndirectoModel){
		CostoIndirecto costoIndirecto = new CostoIndirecto();
		costoIndirecto.setId(costoIndirectoModel.getId());
		costoIndirecto.setDescripcion(costoIndirectoModel.getDescripcion());
		costoIndirecto.setCosto(costoIndirectoModel.getCosto());
		return costoIndirecto;
	}
	
	public CostoIndirectoModel convertCostoIndirecto2CostoIndirectoModel(CostoIndirecto costoIndirecto){
		CostoIndirectoModel costoIndirectoModel = new CostoIndirectoModel();
		costoIndirectoModel.setId(costoIndirecto.getId());
		costoIndirectoModel.setDescripcion(costoIndirecto.getDescripcion());		
		costoIndirectoModel.setCosto(costoIndirecto.getCosto());		
		return costoIndirectoModel;
	}
}
