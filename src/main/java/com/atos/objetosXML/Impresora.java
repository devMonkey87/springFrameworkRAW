package com.atos.objetosXML;

public class Impresora {

	private String tóner;

	private int cabezales;

	private int capacidadMaxima;

	public String getTóner() {
		return tóner;
	}

	public void setTóner(String tóner) {
		this.tóner = tóner;
	}

	public int getCabezales() {
		return cabezales;
	}

	public void setCabezales(int cabezales) {
		this.cabezales = cabezales;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	@Override
	public String toString() {
		return "Impresora [tóner=" + tóner + ", cabezales=" + cabezales + ", capacidadMaxima=" + capacidadMaxima + "]";
	}

	public Impresora(String tóner, int cabezales, int capacidadMaxima) {
		super();
		this.tóner = tóner;
		this.cabezales = cabezales;
		this.capacidadMaxima = capacidadMaxima;
	}

	public Impresora() {
		super();
	}

	public void imprimeInfo() {

		System.out.println("Impresora working!");
	}

}
