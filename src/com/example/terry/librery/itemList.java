package com.example.terry.librery;

public class itemList {
	protected long id;
	protected String nombre;
	        
	public itemList(long id, String nombre) {
	  this.id = id;
	  this.nombre = nombre;
	}
	     
	public long getId() {
	  return id;
	}
	     
	public void setId(long id) {
	  this.id = id;
	}
	     
	public String getNombre() {
	  return nombre;
	}
	     
	public void setNombre(String nombre) {
	  this.nombre = nombre;
	}
}
