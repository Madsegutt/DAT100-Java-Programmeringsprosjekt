package no.hvl.dat100.javel.oppgave3;

public class Customer {

    private String name;
    private String email;
    private int customer_id;
    private PowerAgreementType agreement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {

        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;
    }

    // TODO - getter/setter methods for all objectvariables
    public String getName() {
        return this.name;
    }
    public void setName(String name) {

        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail() {
        this.email = email;
    }

    public int getCustomer_id(){
        return this.customer_id;
    }
    public void setCustomer_id() {
        this.customer_id = customer_id;
    }

    public PowerAgreementType getAgreement() {
        return this.agreement;
    }
    // TODO - toString method
}
