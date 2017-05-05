package com.ferreteria.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="clave")
	private int clave;
	@Column(name="marca")
	private String marca;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="cantidad")
	private int cantidad;
	@Column(name="maximo")
	private int maximo;	
	@Column(name="minimo")
	private int minimo;
	@Column(name="precio")
	private float precio;
	@Column(name="proveedor_id")
	private int proveedor_id;
		
	public int getProveedor_id() {
		return proveedor_id;
	}

	public void setProveedor_id(int proveedor_id) {
		this.proveedor_id = proveedor_id;
	}

	public Producto() {
	}

	public Producto(int id, int clave, String marca, String descripcion, int cantidad, int maximo, int minimo,
			float precio, int proveedor_id) {
		super();
		this.id = id;
		this.clave = clave;
		this.marca = marca;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.maximo = maximo;
		this.minimo = minimo;
		this.precio = precio;
		this.proveedor_id = proveedor_id;
	}

	
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", clave=" + clave + ", marca=" + marca + ", descripcion=" + descripcion
				+ ", cantidad=" + cantidad + ", maximo=" + maximo + ", minimo=" + minimo + ", precio=" + precio
				+ ", proveedor_id=" + proveedor_id + "]";
	}

	public int getClave() {
		return clave;
	}

	public void setClave(int clave) {
		this.clave = clave;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getMaximo() {
		return maximo;
	}

	public void setMaximo(int maximo) {
		this.maximo = maximo;
	}

	public int getMinimo() {
		return minimo;
	}

	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	
}
