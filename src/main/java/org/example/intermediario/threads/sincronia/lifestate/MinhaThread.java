package org.example.intermediario.threads.sincronia.lifestate;

public class MinhaThread implements Runnable {

    private String nome;
    private Boolean estaSuspensa;
    private Boolean foiTerminada;

    public MinhaThread(String nome) {
        this.nome = nome;
        this.estaSuspensa = false;
        this.foiTerminada = false;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println("Executando: " + nome);

        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + nome + " - " + i);
            try {
                Thread.sleep(100);

                synchronized (this) {
                    while (estaSuspensa) {
                        wait();
                    }
                    if (foiTerminada) {
                        break;
                    }
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Thread " + nome + " terminada");
    }

    void suspend() {
        this.estaSuspensa = true;
    }

    synchronized void resume() {
        this.estaSuspensa = false;
        notify();
        System.out.println("Thread " + nome + " retomada");
    }

    synchronized void stop(){
        this.foiTerminada = true;
        notify();
    }
}
