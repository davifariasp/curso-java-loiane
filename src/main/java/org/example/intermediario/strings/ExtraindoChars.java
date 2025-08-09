package org.example.intermediario.strings;

public class ExtraindoChars {
    public static void main(String[] args) {

        String java = "Java";

        for (int i=0; i < java.length(); i++) {
            System.out.print(java.charAt(i));
        }

        char[] chars = new char[3];
        java.getChars(0, 3, chars, 0);

        System.out.println(chars);
    }
}
