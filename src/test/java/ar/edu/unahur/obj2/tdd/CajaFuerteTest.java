package ar.edu.unahur.obj2.tdd;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.tdd.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CajaFuerteTest {

	@Test
	void abrirCajaFuerte() {
		
		var caja = new CajaFuerte();
		
		caja.cerrar(1234);
		caja.abrir(1234);
		
		assertTrue(caja.estado());
	}
	
	@Test
	void cerrarCajaFuerteEstablecerNuevaClaveIntentarAbrirConClaveViejayLuegoNueva() {
		
		var caja = new CajaFuerte();
		
		caja.cerrar(6789);
		
		caja.abrir(1234);	
		assertEquals(Boolean.FALSE, caja.estado());
		
		caja.abrir(6789);
		assertEquals(Boolean.TRUE, caja.estado());
	}
}
