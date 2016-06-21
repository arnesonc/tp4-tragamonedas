package ar.unlam.edu.tp4;

public class Tambor {
	
	private NumberGenerator generator;
	private Integer posicion;
	
	public Tambor(NumberGenerator generator) {
		this.generator = generator;
	}
	
	public Integer getPosicion() {
		return posicion;
	}
	
	public void girar() {
		this.posicion = this.generator.generate();
	}

}
