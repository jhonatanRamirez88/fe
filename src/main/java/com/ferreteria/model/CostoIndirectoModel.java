package com.ferreteria.model;

public class CostoIndirectoModel {
	private int id;
	private String descripcion;
	private float costo;
	
	public CostoIndirectoModel() {
	}
	
	public CostoIndirectoModel(int id, String descripcion, float costo) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.costo = costo;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("id"+id);
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		System.out.println("descripcion"+descripcion);
		this.descripcion = descripcion;
	}
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		System.out.println("costo"+costo);
		this.costo = costo;
	}
	@Override
	public String toString() {
		return "CostoIndirectoModel [id=" + id + ", descripcion=" + descripcion + ", costo=" + costo + "]";
	}
	
}
