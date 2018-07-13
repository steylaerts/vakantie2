package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef je naam: ");

        String  sNaam = scanner.nextLine();
        System.out.println("Kies een bestemming:");

        String[] aBestemmingen = {"de kust", "de Ardennen", "de kempen", "je tuin"};

        for (int i = 0; i < aBestemmingen.length; i++) {
            String sBestemming  = aBestemmingen[i];
            System.out.printf("%4d. %s\n",i+1,sBestemming);
        }
        System.out.printf("Welke bestemming kies je (1-%d)",aBestemmingen.length);

        int iKeuze  =   Integer.parseInt(scanner.nextLine());
        String sBestemming = aBestemmingen[iKeuze-1];

        System.out.printf("Dag %s, goede reis naar %s",sNaam, sBestemming);
    }
}
