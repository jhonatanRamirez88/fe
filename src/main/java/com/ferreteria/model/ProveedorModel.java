package com.ferreteria.model;

public class ProveedorModel {
	private int id;
	private String direccion;
	private String marca;
	private String telefono;
	private String nombre;
	
	public ProveedorModel() {
	}

	public ProveedorModel(int id, String direccion, String marca, String telefono, String nombre) {
		super();
		this.id = id;
		this.direccion = direccion;
		this.marca = marca;
		this.telefono = telefono;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "ProveedorModel [id=" + id + ", direccion=" + direccion + ", marca=" + marca + ", telefono=" + telefono
				+ ", nombre=" + nombre + "]";
	}
}
