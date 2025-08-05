package org.example.intermediario.threads.sincronia.deadlocks.semaforo;

public enum CorSemaforo {
    VERMELHO(3000), AMARELO(1000), VERDE(2000);

    final Integer tempoEspera;

    CorSemaforo(Integer tempoEspera) {
        this.tempoEspera = tempoEspera;
    }
}
