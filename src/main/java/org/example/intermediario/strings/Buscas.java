package org.example.intermediario.strings;

public class Buscas {
    public static void main(String[] args) {
        String banana = "banana";
        String ana = "ana";

        System.out.println(banana.indexOf('x'));
        System.out.println(banana.indexOf(ana));

        System.out.println(banana.lastIndexOf('x'));
        System.out.println(banana.lastIndexOf(ana));
        
        System.out.println(banana.contains("x"));
        System.out.println(banana.contains(ana));
    }
}
