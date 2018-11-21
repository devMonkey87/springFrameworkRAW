package com.atos.objetosAnotaciones;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Ordenador {

	private String teclado;

	private String trackpad;

	private String pantalla;

	public String getTeclado() {
		return teclado;
	}

	public void setTeclado(String teclado) {
		this.teclado = teclado;
	}

	public String getTrackpad() {
		return trackpad;
	}

	public void setTrackpad(String trackpad) {
		this.trackpad = trackpad;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	public Ordenador(String teclado, String trackpad, String pantalla) {
		super();
		this.teclado = teclado;
		this.trackpad = trackpad;
		this.pantalla = pantalla;
	}

	@Override
	public String toString() {
		return "Ordenador [teclado=" + teclado + ", trackpad=" + trackpad + ", pantalla=" + pantalla + "]";
	}

	public Ordenador() {
		super();
	}

	public void procesaDatos() {

		System.out.println("PC's working!");
	}

}
