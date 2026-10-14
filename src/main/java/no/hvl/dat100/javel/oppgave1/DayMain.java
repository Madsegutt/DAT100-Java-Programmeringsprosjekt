package no.hvl.dat100.javel.oppgave1;



public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that tests the methods you implement in the DailyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */


        System.out.println("A) Strømpriser");
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println("");

        System.out.println("B) Strømforbruk");
        DailyPower.printPowerUsage(DayPowerData.powerusage_day);
        System.out.println("");

        System.out.println("C) Total Strømforbruk");
        System.out.println("Summen er: " + DailyPower.computePowerUsage(powerusage_day));
        System.out.println("");

        System.out.println("D) Strømpris med spotpris");
        System.out.println("Spotprisen er: " + DailyPower.computeSpotPrice(powerusage_day, powerprices_day));
        System.out.println("");

        System.out.println("E) Strømpris med strømstøtte");
        for (int i = 0;i < (DayPowerData.powerusage_day).length; i++) {
            double usage = DayPowerData.powerusage_day[i];
            double price = DayPowerData.powerprices_day[i];

            double support = DailyPower.getPowerSupport(usage, price);
            if (support > 0) {
                System.out.println("Straumstøtte: " + support);
            }
        }
        System.out.println("");

        System.out.println("F) Strømstøtte for heildagen");
        System.out.println(DailyPower.computePowerSupport(powerusage_day, powerprices_day));
        System.out.println("");

        System.out.println("G) Norgespris");
        System.out.println("Norgesprisen er: " + DailyPower.computeNorgesPrice(powerusage_day));
        System.out.println("");

        System.out.println("H) Størst strømforbruk");
        System.out.println("Ditt største strømforbruk var: " + DailyPower.findPeakUsage(powerusage_day));
        System.out.println("");

        System.out.println("I) Gjennomsnitt strømforbruk");
        System.out.println("Ditt gjennomsnittlige forbrukt per timne er: " + DailyPower.findAvgPower(powerusage_day));

        System.out.println();


    }
}