package com.sda.algorytmy.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie {
    public static void zad1() {
        Scanner scanner = new Scanner((System.in));
        List<String> stringList = new ArrayList<>();
        System.out.println("Podaj Imiona (wpisanie '-' kończy dodawanie imion): ");
        while (true) {
            String name = scanner.nextLine();

            if(name.equals("-")) {
                break;
            }
            stringList.add(name);

            //String name = scanner.nextLine();
            //stringList.add(name);


        }
        System.out.println("LISTA IMION: ");
        for(String el: stringList){
            System.out.println("Imię: " + el);
        }
    }
}

