package com.ferreteria.service;

import java.util.List;

import com.ferreteria.entity.Proveedor;
import com.ferreteria.model.ProveedorModel;

public interface ProveedoresService {
	public abstract List<ProveedorModel> ListaProveedores();
	public abstract ProveedorModel addProveedor(ProveedorModel proveedorModel);
	public abstract ProveedorModel findProveedorByIdModel(int id);
	public abstract Proveedor findProveedorById(int id);
	public abstract void deleteProveedor(int id);
}
