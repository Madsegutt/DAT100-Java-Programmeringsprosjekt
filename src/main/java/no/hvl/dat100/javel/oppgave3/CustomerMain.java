package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        //Alt bra bortsett fra setCustomer_id, får bare 0
        Customer k1 = new Customer();
        k1.setCustomer_id(2);
        k1.setName("Testernavn");
        k1.setEmail("email@test.com");
        k1.setAgreement(PowerAgreementType.SPOTPRICE);
        System.out.print(k1.toString());
    }
}
