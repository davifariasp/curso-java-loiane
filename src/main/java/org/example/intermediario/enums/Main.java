package org.example.intermediario.enums;

public class Main {
    public static void main(String[] args) {

        double x = 10.0;
        double y = 5.0;

        for (OperacoesMatematicas operacao : OperacoesMatematicas.values()) {
            System.out.print(x);
            System.out.print(" " + operacao.toString() + " ");
            System.out.print(y);
            System.out.println(" = " + operacao.executarOperacao(x, y));
        }
    }
}