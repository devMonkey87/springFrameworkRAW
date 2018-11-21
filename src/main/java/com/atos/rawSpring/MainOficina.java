package com.atos.rawSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atos.objetosAnotaciones.Ordenador;
import com.atos.objetosXML.Impresora;

/**
 * Objetivo de la demo:
 * 
 * Hemos creado 2 beans, Ordenador e Impresora. El primero por anotaciones y el
 * segundo por xml en application-context El propósito es comprobar como se
 * comporta cada bean por defecto si no se modifica su Scope Se han creado dos
 * instancias de cada uno y se les ha asignado el scope "prototype" a ambos ya
 * que de no hacerlo así, por defecto se comportan como Singleton y por tanto
 * las diferentes instancias que se creen harían referencia al mismo objeto.
 *
 */
public class MainOficina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");

		Impresora impresora1 = (Impresora) ctx.getBean("impresora");
		Impresora impresora2 = (Impresora) ctx.getBean("impresora");

		System.out.println("Capacidad máxima impresora 1: " + impresora1.getCapacidadMaxima());
		impresora2.setCapacidadMaxima(1000);
		System.out.println("Capacidad máxima impresora 2: " + impresora2.getCapacidadMaxima());

		System.out.println("Numero de cabezales: " + impresora1.getCabezales());
		System.out.println("Numero de cabezales impresora 2: " + impresora2.getCabezales());

		Ordenador o1 = (Ordenador) ctx.getBean(Ordenador.class);
		Ordenador o2 = (Ordenador) ctx.getBean("ordenador");
		o1.setPantalla("21 pulgadas");
		o2.setTeclado("Spanish");
		System.out.println(o1);
		System.out.println(o2);

	}
}
