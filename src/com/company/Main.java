package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Naucim se programovani a site lol, lololol */
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte prvni cislo: ");
        double a = sc.nextDouble();
        System.out.println("Zadejte druhe cislo: ");
        double b = sc.nextDouble();
        switch (args[0]) {
            case "s" -> System.out.println(a + b);
            case "o" -> System.out.println(a - b);
            case "n" -> System.out.println(a * b);
            case "d" -> System.out.println(a / b);
            default -> System.out.println("Neplatny argument");
        }
    }

}
