package ar.edu.unlam.tp1;

public class Circulo {
	
	private Double radio;

	public Circulo (Double radio) {
		this.radio = radio;
	}
	
	public Double cuantoEsElRadio() {
		return this.radio;
	}
	
	public Double calcularElAreaDeUnCirculo() {
		return Math.PI*Math.pow(this.radio, 2);
	}

}
