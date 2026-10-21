// Att-göra-lista för Djurhottellet
// [x] 1.Skapa klassen katt men namn, chipnummer och ras.
// [x] 2.Skapa klassen kattHotell för att hantera katterna.
// [x] 3.Skapa programmets funktioner enligt kravspecifikation.
// [] 4.Testa att programmet fungerar.

public class Main {
    public static void main(String[] args) {
        System.out.println("Välkommen till Djurhotellet");

        KattHotell hotell = new KattHotell();
        hotell.checkIn(new Katt("Misse", 1001, "Perser"));
        hotell.checkIn(new Katt("Luna", 1002, "Siamese"));
        hotell.checkIn(new Katt("Simba", 1001, "Bengal"));
        System.out.println("Antal katter: " + hotell.antallKatt());

    }
}
