package no.hvl.dat100.javel.oppgave5;

public class Invoices {

    public static void processInvoices(Invoice[] invoices) {

        for(Invoice faktura: invoices){
            if (faktura != null) {
                faktura.computeAmount();
                faktura.printInvoice();
            }
        }

    }
}
