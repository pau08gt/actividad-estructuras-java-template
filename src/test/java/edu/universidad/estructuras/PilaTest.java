package edu.universidad.estructuras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PilaTest {
    @Test
    void debeApilarYDesapilarEnOrdenLIFO() {
        Pila pila = new Pila();
        pila.apilar("Login");
        pila.apilar("Consulta");
        pila.apilar("Pago");

        assertEquals("Pago", pila.desapilar());
        assertEquals("Consulta", pila.desapilar());
        assertEquals("Login", pila.desapilar());
    }

    @Test
    void debeMostrarCimaSinEliminar() {
        Pila pila = new Pila();
        pila.apilar("Buscar");

        assertEquals("Buscar", pila.cima());
        assertEquals(1, pila.tamanio());
    }

    @Test
    void noDebeAceptarNull() {
        Pila pila = new Pila();
        assertThrows(IllegalArgumentException.class, () -> pila.apilar(null));
    }

    @Test
    void desapilarEnVaciaDebeLanzarExcepcion() {
        Pila pila = new Pila();
        assertThrows(IllegalStateException.class, pila::desapilar);
    }

    @Test
    void cimaEnVaciaDebeLanzarExcepcion() {
        Pila pila = new Pila();
        assertThrows(IllegalStateException.class, pila::cima);
    }
}
