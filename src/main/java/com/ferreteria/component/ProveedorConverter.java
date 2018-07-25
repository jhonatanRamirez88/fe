package com.ferreteria.component;

import org.springframework.stereotype.Component;

import com.ferreteria.entity.Proveedor;
import com.ferreteria.model.ProveedorModel;

@Component("proveedorConverter")
public class ProveedorConverter {

	public Proveedor convertProveedorModel2Proveedor(ProveedorModel proveedorModel){
		System.out.println(proveedorModel.toString());
		Proveedor proveedor = new Proveedor();
		proveedor.setId(proveedorModel.getId());
		proveedor.setDireccion(proveedorModel.getDireccion());
		proveedor.setMarca(proveedorModel.getMarca());
		proveedor.setNombre(proveedorModel.getNombre());
		proveedor.setTelefono(proveedorModel.getTelefono());
		return proveedor;
	}
	
	public ProveedorModel convertProveedor2ProveedorModel(Proveedor proveedor){
		System.out.println(proveedor.toString());
		ProveedorModel proveedorModel = new ProveedorModel();
		proveedorModel.setId(proveedor.getId());
		proveedorModel.setDireccion(proveedor.getDireccion());
		proveedorModel.setMarca(proveedor.getMarca());
		proveedorModel.setNombre(proveedor.getNombre());
		proveedorModel.setTelefono(proveedor.getTelefono());
		return proveedorModel;
	}
}
