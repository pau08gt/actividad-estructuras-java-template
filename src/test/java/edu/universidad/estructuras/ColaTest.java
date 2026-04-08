package edu.universidad.estructuras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ColaTest {
    @Test
    void debeEncolarYDesencolarEnOrdenFIFO() {
    Cola cola = new Cola();
    cola.encolar("Ana");
    cola.encolar("Luis");
    cola.encolar("Marta");

    assertEquals("Ana", cola.desencolar());
    assertEquals("Luis", cola.desencolar());
    assertEquals("Marta", cola.desencolar());
    }

    @Test
    void debeMostrarElFrenteSinEliminar() {
        Cola cola = new Cola();
        cola.encolar("Carlos");

        assertEquals("Carlos", cola.frente());
        assertEquals(1, cola.tamanio());
    }

    @Test
    void noDebeAceptarNull() {
        Cola cola = new Cola();
        assertThrows(IllegalArgumentException.class, () -> cola.encolar(null));
    }

    @Test
    void desencolarEnVaciaDebeLanzarExcepcion() {
        Cola cola = new Cola();
        assertThrows(IllegalStateException.class, cola::desencolar);
    }

    @Test
    void frenteEnVaciaDebeLanzarExcepcion() {
        Cola cola = new Cola();
        assertThrows(IllegalStateException.class, cola::frente);
    }
}
