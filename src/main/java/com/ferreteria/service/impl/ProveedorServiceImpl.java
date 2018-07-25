package com.ferreteria.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ferreteria.component.ProveedorConverter;
import com.ferreteria.entity.Proveedor;
import com.ferreteria.model.ProveedorModel;
import com.ferreteria.repository.ProveedorReporsitory;
import com.ferreteria.service.ProveedoresService;

@Service("proveedorServiceImpl")
public class ProveedorServiceImpl implements ProveedoresService{
	@Autowired
	@Qualifier("proveedorRepository")
	private ProveedorReporsitory proveedorRepository;
	
	@Autowired
	@Qualifier("proveedorConverter")
	private ProveedorConverter proveedorConverter;

	@Override
	public List<ProveedorModel> ListaProveedores() {
		List<Proveedor> proveedores = proveedorRepository.findAll();
		List<ProveedorModel> proveedoresModel = new ArrayList<ProveedorModel>();
		for(Proveedor proveedor: proveedores){
			proveedoresModel.add(proveedorConverter.convertProveedor2ProveedorModel(proveedor));
		}
		return proveedoresModel;
	}

	@Override
	public ProveedorModel addProveedor(ProveedorModel proveedorModel) {
		Proveedor proveedor = proveedorRepository.save(proveedorConverter.convertProveedorModel2Proveedor(proveedorModel));
		return proveedorConverter.convertProveedor2ProveedorModel(proveedor);
	}

	@Override
	public ProveedorModel findProveedorByIdModel(int id) {
		return proveedorConverter.convertProveedor2ProveedorModel(findProveedorById(id));
	}

	@Override
	public Proveedor findProveedorById(int id) {
		return proveedorRepository.findById(id);
	}

	@Override
	public void deleteProveedor(int id) {
		Proveedor proveedor = findProveedorById(id);
		if (proveedor != null) {
			proveedorRepository.delete(proveedor);
		}		
	}

}
