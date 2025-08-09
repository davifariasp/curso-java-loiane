package org.example.intermediario.strings;

import java.util.StringTokenizer;

public class SeparacaoElegante {
    public static void main(String[] args) {

        String doArquivo = "1;Davi;30";

        StringTokenizer st = new StringTokenizer(doArquivo, ";");

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }
}
