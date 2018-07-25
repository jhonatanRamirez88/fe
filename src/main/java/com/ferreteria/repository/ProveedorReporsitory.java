package com.ferreteria.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferreteria.entity.Proveedor;

@Repository("proveedorRepository")
public interface ProveedorReporsitory extends JpaRepository<Proveedor, Serializable>{
	public abstract Proveedor findById(int id);
}
