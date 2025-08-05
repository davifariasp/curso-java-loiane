package org.example.intermediario.threads.runnable;

import org.example.intermediario.threads.thread.MinhaThread;

public class LifeTimeThreads {
    public static void main(String[] args) {
        MinhaThread minhaThread1 = new MinhaThread("#1", 500);
        MinhaThread minhaThread2 = new MinhaThread("#2", 700);
        MinhaThread minhaThread3 = new MinhaThread("#3", 300);

        //minhaThread1.isAlive() retorna true se a thread estiver em execução;
        //minhaThread1.join(200) bloqueia a thread principal até que a thread minhaThread1 termine ou até que o tempo limite de 200 milissegundos seja atingido
        //Thread.sleep(1000) faz com que a thread atual (neste caso, a thread principal) durma por 1 segundo
        //Thread.join() é usado para esperar que a thread termine sua execução antes de continuar com o restante do código

        //Thread.setPriority(int newPriority) é usado para definir a prioridade da thread, onde valores mais altos indicam maior prioridade.
        //Thread.setPriority(Thread.MAX_PRIORITY) define a prioridade máxima para a thread, enquanto Thread.setPriority(Thread.MIN_PRIORITY) define a prioridade mínima.

        try {
            minhaThread1.join();
            minhaThread2.join();
            minhaThread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Todas as threads terminaram a execução.");
    }
}
