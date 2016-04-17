package ar.edu.unlam.tp1;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void circuloConRadio2() {
		Circulo nuevoCirculo = new Circulo(2.0);
		assertEquals(2, nuevoCirculo.cuantoEsElRadio(), 0.01);
	
	}
	
	@org.junit.Test
	public void circuloConRadio3Punto7() {
		Circulo nuevoCirculo = new Circulo(3.7);
		assertEquals(3.7, nuevoCirculo.cuantoEsElRadio(), 0.01);
	
	}
	
	@org.junit.Test
	public void circuloConRadio5() {
		Circulo nuevoCirculo = new Circulo(5.0);
		assertEquals(5, nuevoCirculo.cuantoEsElRadio(), 0.01);
	
	}
	
	@org.junit.Test
	public void circuloConRadio10Punto9() {
		Circulo nuevoCirculo = new Circulo(10.9);
		assertEquals(10.9, nuevoCirculo.cuantoEsElRadio(), 0.01);
	
	}

	@org.junit.Test
	public void calcularElPerimetroDelCirculoConRadio9Punto8() {
		Circulo nuevoCirculo = new Circulo(9.8);
		assertEquals(301.71, nuevoCirculo.calcularElAreaDeUnCirculo(), 0.01);
	
	}
	
	@org.junit.Test
	public void calcularElPerimetroDelCirculoConRadio16Punto6() {
		Circulo nuevoCirculo = new Circulo(16.6);
		assertEquals(865.69, nuevoCirculo.calcularElAreaDeUnCirculo(), 0.01);
	
	}
}
