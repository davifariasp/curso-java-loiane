package org.example.intermediario.strings;

public class ConcatenacaoElegante {
    public static void main(String[] args) {

        String[] letras = {"A", "B", "C", "D"};
        String alfabeto = "";

        //thread safe
        StringBuffer sb = new StringBuffer();

        for (String letra : letras) {
            sb.append(letra).append(",");
        }

        alfabeto = sb.toString();
        System.out.println(alfabeto);

        // Não é thread safe, mas mais rápido
        StringBuilder sb_ = new StringBuilder();

        for (String letra : letras) {
            sb_.append(letra).append(",");
        }

        alfabeto = sb_.toString();
        System.out.println(alfabeto);

    }
}
