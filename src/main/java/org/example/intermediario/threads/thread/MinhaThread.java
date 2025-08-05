package org.example.intermediario.threads.thread;

public class MinhaThread extends Thread{

    private String nome;
    private Integer tempo;

    public MinhaThread(String nome, Integer tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(nome + " contador " + i);
            try {
                sleep(tempo);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(nome + " terminou a execuçao.");
    }

}
