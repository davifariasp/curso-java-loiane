package org.example.intermediario.elementosbasicos.garbagecollector;

public class Main {

    public static void obterMemoriaUsada() {

        Runtime runtime = Runtime.getRuntime();

        long memoriaUsada = (runtime.totalMemory() - runtime.freeMemory())/ (1024 * 1024);

        System.out.println("Memória usada: " + memoriaUsada + " MB");
    }

    public static void main(String[] args) {
        Contato[] contatos = new Contato[10000];
        Contato contato;

        for(int i = 0; i < contatos.length; i++) {
            contato = new Contato("Contato " + i, "123456789" + i, "contato" + i + "@email.com");
            contatos[i] = contato;
        }

        obterMemoriaUsada();

        System.out.println("Contatos criados com sucesso!");

        contatos = null; // Liberando a referência ao array de contatos

        System.gc(); // Solicita a execução do Garbage Collector

        System.out.println("Contatos removidos com sucesso!");

        obterMemoriaUsada();
    }
}
