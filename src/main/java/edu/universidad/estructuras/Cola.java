package edu.universidad.estructuras;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    private Queue<String> cola;

    public Cola() {
        cola=new LinkedList();
    }

    public void encolar(String cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("No se permite insertar null");
        }

    }

    public String desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }

        return "";
    }

    public String frente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return "";
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }

    public int tamanio() {
        return cola.size();
    }
}

