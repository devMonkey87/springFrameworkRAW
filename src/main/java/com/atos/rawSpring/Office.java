package com.atos.rawSpring;

import org.springframework.beans.factory.annotation.Autowired;

import com.atos.objetosAnotaciones.Ordenador;
import com.atos.objetosXML.Impresora;

public class Office {

	@Autowired
	public Ordenador pcOficina;
	@Autowired
	public Impresora impresoraOficina;

}
