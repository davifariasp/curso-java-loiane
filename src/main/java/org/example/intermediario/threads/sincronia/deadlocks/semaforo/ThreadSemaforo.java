package org.example.intermediario.threads.sincronia.deadlocks.semaforo;

public class ThreadSemaforo implements Runnable {
    private CorSemaforo corSemaforo;
    private Boolean corMudou;
    private Boolean parar;

    public ThreadSemaforo() {
        this.corSemaforo = CorSemaforo.VERDE;
        this.parar = false;
        this.corMudou = false;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!parar) {
            try {
                Thread.sleep(corSemaforo.tempoEspera);
                this.mudarCor();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private synchronized void mudarCor() {

        switch (this.corSemaforo) {
            case VERDE:
                this.corSemaforo = CorSemaforo.AMARELO;
                break;
            case AMARELO:
                this.corSemaforo = CorSemaforo.VERMELHO;
                break;
            case VERMELHO:
                this.corSemaforo = CorSemaforo.VERDE;
                break;
        }

        this.corMudou = true;
        notify();
    }

    public synchronized void parar() {
        this.parar = true;
        notify();
        System.out.println("Thread parada");
    }

    public synchronized void esperaCorMudar() {
        while (!corMudou) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.corMudou = false;
    }

    public String getCorSemaforo() {
        return corSemaforo.name();
    }
}
