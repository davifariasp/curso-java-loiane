package org.example.intermediario.threads.sincronia.lifestate;

public class Main {
    public static void main(String[] args) {
        MinhaThread thread1 = new MinhaThread("Thread 1");
        MinhaThread thread2 = new MinhaThread("Thread 2");

        thread1.suspend();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread2.suspend();

        thread1.resume();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread2.resume();

        thread2.stop();
    }
}
