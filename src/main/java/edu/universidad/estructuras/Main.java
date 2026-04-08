package edu.universidad.estructuras;

public class Main {
    public static void main(String[] args) {
        Cola cola1 = new Cola();
        cola1.encolar("Ana");
        cola1.encolar("Luis");

        System.out.println("Frente de la cola: " + cola1.frente());
        System.out.println("Sale de la cola: " + cola1.desencolar());
        System.out.println("Tamaño cola: " + cola1.tamanio());

        Pila pila = new Pila();
       /* pila.apilar("Inicio de sesión");
        pila.apilar("Consulta");

        System.out.println("Cima de la pila: " + pila.cima());
        System.out.println("Sale de la pila: " + pila.desapilar());
        System.out.println("Tamaño pila: " + pila.tamanio());
        */

    }

}
