package org.example.intermediario.threads.sincronia.tiquetaque;

public class ThreadTiqueTaque implements Runnable {

    TiqueTaque tiqueTaque;
    Thread thread;
    final Integer NUM = 5;

    public ThreadTiqueTaque(String nome, TiqueTaque tiqueTaque) {
        this.tiqueTaque = tiqueTaque;
        this.thread = new Thread(this, nome);
        thread.start();
    }


    @Override
    public void run() {
        if (thread.getName().equals("Tique")) {
            for (int i = 0; i < NUM; i++) {
                tiqueTaque.tique(true);
            }
            tiqueTaque.tique(false);
        } else {
            for (int i = 0; i < NUM; i++) {
                tiqueTaque.taque(true);
            }
            tiqueTaque.taque(false);
        }
    }
}
