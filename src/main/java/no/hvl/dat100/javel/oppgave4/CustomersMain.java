package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    private static Customer lagKunde(int id, String navn, String epost, PowerAgreementType avtale) {
        Customer k = new Customer();
        k.setCustomer_id(id);
        k.setName(navn);
        k.setEmail(epost);
        k.setAgreement(avtale);
        return k;
    }

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        // a) konstruktør
        Customers kunder = new Customers(5);

        // b) telle
        System.out.println("Antall kunder: " + kunder.countNonNull());
        System.out.println();

        // d) sette inn
        System.out.println("Legger til kunder i tabellen:");
        System.out.println(kunder.addCustomer(lagKunde(1001, "Alice Smith", "alice@example.com", PowerAgreementType.SPOTPRICE)));
        System.out.println(kunder.addCustomer(lagKunde(1002, "Thomas Riley", "alice@example.com", PowerAgreementType.SPOTPRICE)));
        System.out.println(kunder.addCustomer(lagKunde(1003, "Charlie Rose", "charlie@example.com", PowerAgreementType.POWERSUPPORT)));
        System.out.println(kunder.addCustomer(lagKunde(1004, "Diana Prince", "diana@example.com", PowerAgreementType.NORGESPRICE)));
        System.out.println(kunder.addCustomer(lagKunde(1005, "Ethan Hunt", "ethan@example.com", PowerAgreementType.POWERSUPPORT)));
        System.out.println("Ledig plass i tabellen?: ");
        System.out.println("Antall kunder: " + kunder.countNonNull());
        System.out.println();

        // c) hente
        System.out.println("Henter kunde 1003:");
        System.out.println(kunder.getCustomer(1003));
        System.out.println("Henter kunde 9999: " + kunder.getCustomer(9999));
        System.out.println();

        // e) slette
        System.out.println("Sletter kunde 1002:");
        System.out.println(kunder.removeCustomer(1002));
        System.out.println("Sletter kunde 1002 igjen: " + kunder.removeCustomer(1002));
        System.out.println("Antall kunder: " + kunder.countNonNull());
        System.out.println();

        // f) ny tabell med alle kunder
        Customer[] alle = kunder.getCustomers();
        System.out.println("Alle kunder (" + alle.length + "):");
        for (int i = 0; i < alle.length; i++) {
            System.out.println(alle[i]);
            System.out.println();
        }
    }

}
