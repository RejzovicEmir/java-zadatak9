import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner noviBroj = new Scanner(System.in);

        System.out.print("Unesite 10 brojeva razdvojenih zarezom: ");
        String input = noviBroj.nextLine();

        //Razdvajanje inputa zarezima
        String[] brojeviNiza = input.split("\\,+");

        //if statement za provjeru koliko brojeva je uneseno
        if (brojeviNiza.length != 10) {
            System.out.println("Molimo unesite tacno 10 brojeva odvojenih zarezom.");
        } else {
            //Konvertovanje stringa u integer i dodavanje u niz
            int[] brojeviUnutarNiza = new int[10];
            System.out.println("Uneseni brojevi djeljivi i sa 2 i sa 3 su:");
            for (int i = 0; i < brojeviNiza.length; i++) {
                brojeviUnutarNiza[i] = Integer.parseInt(brojeviNiza[i]);
                if (brojeviUnutarNiza[i] % 2 == 0 && brojeviUnutarNiza[i] % 3 == 0) {
                    int djeljiviBroj = Integer.parseInt(brojeviNiza[i]);
                    System.out.print(" " + djeljiviBroj);
                }
            }
        }
    }
}

