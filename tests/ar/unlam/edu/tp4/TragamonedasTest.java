package ar.unlam.edu.tp4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TragamonedasTest {

	@Test
	public void queElGeneradorDeUnNumeroFijo() {
		Integer numero = 2;
		NumberGenerator generador = new FixNumberGenerator(numero);
		assertEquals(numero, generador.generate());
	}
	
	@Test
	public void queElGeneradorDeUnNumeroDe1A10() {
		NumberGenerator generador = new RandomNumberGenerator();
		Integer numeroGenerado = generador.generate();
		Boolean estaEntre1Y10 = numeroGenerado >= 1 && numeroGenerado <= 10;
		assertEquals(true, estaEntre1Y10);
	}
	
	@Test
	public void queElTamborSeCreeEnLaPosicion1() {
		Tambor miTambor = new Tambor(new RandomNumberGenerator());
		assertEquals(1, miTambor.getPosicion().intValue());
	}
	
	@Test
	public void queElTamborCaigaEnLaPosicionDelGeneradoFijo() {
		Tambor miTambor = new Tambor(new FixNumberGenerator(5));
		miTambor.girar();
		assertEquals(5, miTambor.getPosicion().intValue());
	}
	
	@Test
	public void queElTragamonedasGaneAlActivarConUnGeneradorFijo() {
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();
		assertEquals(true, miTragamonedas.entregarPremio());
	}

}
