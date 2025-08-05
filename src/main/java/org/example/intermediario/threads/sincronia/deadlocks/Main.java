package org.example.intermediario.threads.sincronia.deadlocks;

public class Main {
    public static void main(String[] args) {

        final String RECURSO1 = "Recurso #1";
        final String RECURSO2 = "Recurso #2";

        Thread t1 = new Thread(){
            public void run(){
                synchronized (RECURSO1) {
                    System.out.println("Thread 1: bloqueou o " + RECURSO1);

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("Thread 1: tentando acessar o " + RECURSO2);

                    synchronized (RECURSO2) {
                        System.out.println("Thread 1: bloqueou o " + RECURSO2);
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                synchronized (RECURSO2) {
                    System.out.println("Thread 2: bloqueou o " + RECURSO2);

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("Thread 2: tentando acessar o " + RECURSO1);

                    synchronized (RECURSO1) {
                        System.out.println("Thread 2: bloqueou o " + RECURSO1);
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
