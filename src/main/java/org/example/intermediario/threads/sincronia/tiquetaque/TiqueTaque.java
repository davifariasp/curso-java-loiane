package org.example.intermediario.threads.sincronia.tiquetaque;

public class TiqueTaque {

    Boolean tique;

    synchronized void tique(boolean estaExecutando){

        if(!estaExecutando){
            tique = true;
            notify();
            return;
        }

        System.out.print("Tique ");

        tique = true;

        notify();

        while(tique){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    synchronized void taque(boolean estaExecutando){

        if(!estaExecutando){
            tique = true;
            notify();
            return;
        }

        System.out.println("Taque ");

        tique = false;

        notify();

        while(!tique){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
