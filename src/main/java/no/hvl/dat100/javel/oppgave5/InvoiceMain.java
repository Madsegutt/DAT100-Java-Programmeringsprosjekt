package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;


public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        double[][] usage1 = CustomerPowerUsageData.usage_month_customer1;
        double[][] usage2 = CustomerPowerUsageData.usage_month_customer2;
        double[][] usage3 = CustomerPowerUsageData.usage_month_customer3;
        double[][] power_prices = MonthPowerData.powerprices_month;


        Customer kunde1 = new Customer(
                "Charlie Rose", "charlie@example.com", 1003,
                PowerAgreementType.POWERSUPPORT
        );

        Customer kunde2 = new Customer(
                "Diana Prince", "diana@example.com", 1004,
                PowerAgreementType.NORGESPRICE
        );

        Customer kunde3 = new Customer(
                "Ethan Hunt", "ethan@example.com", 1005,
                PowerAgreementType.SPOTPRICE
        );

        Invoice[] fakturaer = {
                new Invoice(kunde1, "October", usage1, power_prices),
                new Invoice(kunde2, "October", usage2, power_prices),
                new Invoice(kunde3, "October", usage3, power_prices)
        };

        Invoices.processInvoices(fakturaer);
    }
}
