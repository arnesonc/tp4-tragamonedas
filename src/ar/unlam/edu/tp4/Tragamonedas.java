package ar.unlam.edu.tp4;

public class Tragamonedas {
	
	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	
	
	public Tragamonedas() {
		NumberGenerator generator1 = new FixNumberGenerator(1);
		NumberGenerator generator2 = new RandomNumberGenerator();
		this.tambor1 = new Tambor(generator2);
		this.tambor2 = new Tambor(generator2);
		this.tambor3 = new Tambor(generator2);
	}
	
	public void activar() {
		this.tambor1.girar();
		this.tambor2.girar();
		this.tambor3.girar();
	}
	
	public Boolean entregarPremio() {
		System.out.println("Valor del tambor 1: " + this.tambor1.getPosicion());
		System.out.println("Valor del tambor 2: " + this.tambor2.getPosicion());
		System.out.println("Valor del tambor 3: " + this.tambor3.getPosicion());
		if (this.tambor1.getPosicion() == this.tambor2.getPosicion() &&
				this.tambor2.getPosicion() == this.tambor3.getPosicion()) {
			System.out.println("¡GANASTE!");
			return true;
		} else {
			System.out.println("perdiste...");
			return false;
		}
	}

}
