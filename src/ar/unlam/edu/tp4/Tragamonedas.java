package ar.unlam.edu.tp4;

public class Tragamonedas {
	
	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	
	
	public Tragamonedas() {
		NumberGenerator generator1 = new FixNumberGenerator(7);
		this.tambor1 = new Tambor(generator1);
		this.tambor2 = new Tambor(generator1);
		this.tambor3 = new Tambor(generator1);
	}
	
	public void activar() {
		this.tambor1.girar();
		this.tambor2.girar();
		this.tambor3.girar();
	}
	
	public Boolean entregarPremio() {
		if (this.tambor1.getPosicion() == this.tambor2.getPosicion() &&
				this.tambor2.getPosicion() == this.tambor3.getPosicion()) {
			return true;
		} else {
			return false;
		}
	}

}
