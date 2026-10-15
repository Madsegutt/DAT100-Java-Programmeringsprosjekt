package no.hvl.dat100.javel.oppgave3;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer k1 = new Customer("Testnavn", "Test@email.com", 1, PowerAgreementType.POWERSUPPORT);
        //Test k1, frå linjen ovanfor
        System.out.println(k1.toString());
        System.out.println();

        //k1 blir endra av set 
        k1.setCustomer_id(100); 
        k1.setName("Alice Smith");
        k1.setEmail("alice@example.com");
        k1.setAgreement(PowerAgreementType.SPOTPRICE);
        //Viser at set funker, kaller toString på k1 med nye verdiar 
        System.out.println(k1.toString());
        System.out.println();
        
        //Tester at getter funker (henter k1 sin info og skriver ut)
        System.out.println("Navn: " + k1.getName());
        System.out.println("ID: " + k1.getCustomer_id());
        System.out.println("Email: " + k1.getEmail());
        System.out.println("Avtale: " + k1.getAgreement());
    }
}
