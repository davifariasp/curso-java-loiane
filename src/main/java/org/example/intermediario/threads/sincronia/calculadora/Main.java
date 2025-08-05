package org.example.intermediario.threads.sincronia.calculadora;


public class Main {
    public static void main(String[] args) {

        Integer[] numeros = {1, 2, 3, 4, 5,};

        MinhaThreadSoma t1 = new MinhaThreadSoma("#1", numeros);

        MinhaThreadSoma t2 = new MinhaThreadSoma("#2", numeros);
    }
}
