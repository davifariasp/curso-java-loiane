package org.example.intermediario.threads.sincronia.calculadora;

public class MinhaThreadSoma implements Runnable {

    private String nome;
    private Integer[] nums;
    private static Calculadora calculadora = new Calculadora();

    public MinhaThreadSoma(String nome, Integer[] nums) {
        this.nome = nome;
        this.nums = nums;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {

        System.out.println("Iniciando a thread: " + this.nome);

        int some = calculadora.somaArray(nums);

        System.out.println("Thread " + this.nome + " finalizada. Soma: " + some);
    }
}
