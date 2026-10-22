// Att-göra-lista för Djurhottellet
// [x] 1.Skapa klassen katt men namn, chipnummer och ras.
// [x] 2.Skapa klassen kattHotell för att hantera katterna.
// [x] 3.Skapa programmets funktioner enligt kravspecifikation.
// [x] 4.Testa att programmet fungerar.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Välkommen till Djurhotellet");

        KattHotell hotell = new KattHotell();
        Scanner scanner = new Scanner(System.in);
        hotell.upprop();
        hotell.checkIn(new Katt("Misse", 1001, "Perser"));
        hotell.checkIn(new Katt("Luna", 1002, "Siamese"));
        hotell.checkIn(new Katt("Simba", 1001, "Bengal"));
        System.out.println("Antal katter: " + hotell.antallKatt());
        hotell.upprop();

        Katt hittad = hotell.hittaNamn("Misse");
        if (hittad != null) {
            System.out.println("Hittad katt: " + hittad.getNamn());
            System.out.println("Ras: " + hittad.getRas());
            System.out.println("Chipnymmer:" + hittad.getChipnummer());
        } else{
            System.out.println("Ingen katt med det namnet är incheckad här!");
        }
        while (true) {

            System.out.println("==== TASS & MYs ====");
            System.out.println("1. Checka in katt");
            System.out.println("2. Lista alla incheckade katter");
            System.out.println("3. Sök katt på namn");
            System.out.println("4. Avsluta programmet");
            System.out.println("Välj ett alternative");
            String val1 = scanner.nextLine();
            if (val1.equals("1")) {
                System.out.println("Du har valt att checka in en katt.");
                System.out.println("Ange kattens namn: ");
                String kattName = scanner.nextLine();
                System.out.println("Ange kattens ras: .");
                String ras = scanner.nextLine();
                System.out.println("Ange kattens chipnymmer: .");
                String chipText = scanner.nextLine();
                try {
                    int chipnummer = Integer.parseInt(chipText);
                    hotell.checkIn(new Katt(kattName, chipnummer, ras));
                } catch (NumberFormatException e) {
                    System.out.println("Fel! Chipnumret måste vara ett hrltal.");
                }
            } else if (val1.equals("2")) {
                hotell.upprop();
            } else if (val1.equals("3")) {

                System.out.print("Ange kattens namn: ");
                String namn = scanner.nextLine();
                Katt hittadKatt = hotell.hittaNamn(namn);

                if (hittadKatt != null) {
                    System.out.println("Namn: " + hittadKatt.getNamn());
                    System.out.println("Ras: " + hittadKatt.getRas());
                    System.out.println("Chipnummer: " + hittadKatt.getChipnummer());
                } else {
                    System.out.println("Ingen katt med det namnet är incheckad här.");
                }
            } else if (val1.equals("4")) {
                System.out.println("Tack för att du använde Tass & Mys! Hej då!");
                break;
            }
        }
    }
}
