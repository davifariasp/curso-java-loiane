package org.example.intermediario.threads.sincronia.calculadora;

public class Calculadora {

    private Integer soma;

    public synchronized int somaArray(Integer[] array) {
        soma = 0;

        for (int i = 0; i < array.length; i++) {

            soma += array[i];

            System.out.println("Executando a soma " + Thread.currentThread().getName() + " somando o valor " + array[i] + " com total de " + soma);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

//        synchronized (this) {
//            for (int i = 0; i < array.length; i++) {
//                soma += array[i];
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }

        return soma;
    }
}
