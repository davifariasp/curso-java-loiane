package org.example.intermediario.strings;

public class ModificandoStrings {
    public static void main(String[] args) {
        String teste = "Isso é um teste";

        System.out.println(teste);
        System.out.println(teste.substring(10));
        System.out.println(teste.substring(10, 14));

        String ola = "Olá";
        String mundo = "mundo";
        String olaMundo = ola.concat(mundo);
        System.out.println(olaMundo);
        olaMundo = ola.concat(" ").concat(mundo);
        System.out.println(olaMundo);

        String espacos = "i s p a ç o";
        System.out.println(espacos);
        String correcao = espacos.replaceFirst("i", "e");
        System.out.println(correcao);
        String semEspacos = espacos.replace(" ", "");
        System.out.println(semEspacos);

        String nome = "   João da Silva   ";
        System.out.println(nome);
        System.out.println(nome.trim());

        String nomeMaiusculo = nome.toUpperCase();
        System.out.println(nomeMaiusculo);
        String nomeMinusculo = nome.toLowerCase();
        System.out.println(nomeMinusculo);

        String alfebeto = String.join(",", "A", "B", "C", "D");
        System.out.println(alfebeto);

        String[] letras = alfebeto.split(",");

        for (String letra : letras) {
            System.out.println(letra);
        }

        String doArquivo = "1;Davi;30";

        String[] partes = doArquivo.split(";");

        System.out.println("ID: " + partes[0]);
        System.out.println("Nome: " + partes[1]);
        System.out.println("Idade: " + partes[2]);

    }
}
