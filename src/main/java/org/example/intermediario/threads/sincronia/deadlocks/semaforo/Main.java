package org.example.intermediario.threads.sincronia.deadlocks.semaforo;

public class Main {
    public static void main(String[] args) {
        ThreadSemaforo threadSemaforo = new ThreadSemaforo();

        for (int i = 0; i < 4; i++) {
            System.out.println("O Semaforo está " + threadSemaforo.getCorSemaforo());
            threadSemaforo.esperaCorMudar();
        }

        try {
            Thread.sleep(10000); // Deixa o semáforo rodando por 10 segundos
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        threadSemaforo.parar();
    }
}
