package ar.unlam.edu.tp4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TragamonedasTest {

	@Test
	public void queElTragamonedasInicieConTamboresEn1() {
		Tragamonedas miTragamonedas = new Tragamonedas();
		miTragamonedas.activar();
		assertEquals(true, miTragamonedas.entregarPremio());
	}

}
