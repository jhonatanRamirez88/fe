package com.ferreteria.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="costos_indirectos")
public class CostoIndirecto {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="costo")
	private float costo;
	
	public CostoIndirecto() {
	}

	public CostoIndirecto(int id, String descripcion, float costo) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "CostoIndirecto [id=" + id + ", descripcion=" + descripcion + ", costo=" + costo + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}
		
}
