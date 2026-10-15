package no.hvl.dat100.javel.oppgave3;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer k1 = new Customer();
        k1.setCustomer_id(100);
        k1.setName("Alice Smith");
        k1.setEmail("alice@example.com");
        k1.setAgreement(PowerAgreementType.SPOTPRICE);
        System.out.println(k1.toString());
    }
}
