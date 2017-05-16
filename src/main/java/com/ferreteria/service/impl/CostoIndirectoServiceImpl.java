package com.ferreteria.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ferreteria.component.CostoIndirectoConverter;
import com.ferreteria.entity.CostoIndirecto;
import com.ferreteria.model.CostoIndirectoModel;
import com.ferreteria.repository.CostoIndirectoRepository;
import com.ferreteria.service.CostoIndirectoService;

@Service("costoIndirectoServiceImpl")
public class CostoIndirectoServiceImpl implements CostoIndirectoService{
	@Autowired
	@Qualifier("costoIndirectoRepository")
	private CostoIndirectoRepository costoIndirectoRepository;
	@Autowired
	@Qualifier("costoIndirectoConverter")
	private CostoIndirectoConverter costoIndirectoConverter;
	@Override
	public List<CostoIndirectoModel> ListaTodosCostosIndirectos() {
		List<CostoIndirecto> costosIndirectos = costoIndirectoRepository.findAll();
		List<CostoIndirectoModel> costosIndirectosModel = new ArrayList<CostoIndirectoModel>();
		for(CostoIndirecto costo: costosIndirectos){
			System.out.println(costo.toString());
			costosIndirectosModel.add(costoIndirectoConverter.convertCostoIndirecto2CostoIndirectoModel(costo));
		}
		return costosIndirectosModel;
	}
	
	@Override
	public CostoIndirectoModel findCostoIndirectoByIdModel(int id) {
		return costoIndirectoConverter.convertCostoIndirecto2CostoIndirectoModel(findCostoIndirectoById(id));
	}
	@Override
	public CostoIndirecto findCostoIndirectoById(int id) {
		return costoIndirectoRepository.findById(id);
	}

	@Override
	public CostoIndirectoModel addCostoIndirecto(CostoIndirectoModel costoIndirectoModel) {
		CostoIndirecto costoIndirecto = costoIndirectoRepository.save(costoIndirectoConverter.convertCostoIndirectoModel2CostoIndirecto(costoIndirectoModel));
		
		return costoIndirectoConverter.convertCostoIndirecto2CostoIndirectoModel(costoIndirecto);
	}
}
