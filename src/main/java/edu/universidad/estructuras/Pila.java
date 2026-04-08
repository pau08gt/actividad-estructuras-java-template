package edu.universidad.estructuras;

import java.util.Stack;

public class Pila {
    Stack<String> pila;

    public Pila(){
        pila=new Stack<>();
    }

    public void apilar(String accion) {
        if (accion == null) {
            throw new IllegalArgumentException("No se permite insertar null");
        }

    }

    public String desapilar() {
        if (estaVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
       return "";
    }

    public String cima() {
       return pila.peek();
    }

    public boolean estaVacia() {
        return true ;
    }

    public int tamanio() {
        return pila.size();
    }
}
