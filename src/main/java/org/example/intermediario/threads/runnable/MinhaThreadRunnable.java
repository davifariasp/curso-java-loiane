package org.example.intermediario.threads.runnable;

public class MinhaThreadRunnable implements Runnable {

    private String nome;
    private Integer tempo;

    public MinhaThreadRunnable(String nome, Integer tempo) {
        this.nome = nome;
        this.tempo = tempo;
        Thread thread1 = new Thread(this);
        thread1.start();
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(nome + " contador " + i);
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(nome + " terminou a execuçao.");
    }
}
