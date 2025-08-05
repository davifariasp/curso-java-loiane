package org.example.intermediario.threads.sincronia.tiquetaque;

public class Main {
    public static void main(String[] args) {

        TiqueTaque tiqueTaque = new TiqueTaque();

        ThreadTiqueTaque tique = new ThreadTiqueTaque("Tique", tiqueTaque);
        ThreadTiqueTaque taque = new ThreadTiqueTaque("Taque", tiqueTaque);

        try {
            taque.thread.join();
            tique.thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
