package com.ferreteria.service;

import java.util.List;

import com.ferreteria.entity.CostoIndirecto;
import com.ferreteria.model.CostoIndirectoModel;

public interface CostoIndirectoService {
	public abstract List<CostoIndirectoModel> ListaTodosCostosIndirectos();
	public abstract CostoIndirectoModel findCostoIndirectoByIdModel(int id);
	public abstract CostoIndirecto findCostoIndirectoById(int id);
	public abstract CostoIndirectoModel addCostoIndirecto(CostoIndirectoModel costoIndirectoModel);
}
