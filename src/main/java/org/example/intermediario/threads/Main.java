package org.example.intermediario.threads;

public class Main {
    public static void main(String[] args) {
//        MinhaThread thread1 = new MinhaThread("Thread #1", 1000);
//        MinhaThread thread2 = new MinhaThread("Thread #2", 500);

        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 2000);
    }
}
