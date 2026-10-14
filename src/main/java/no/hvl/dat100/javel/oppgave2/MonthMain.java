package no.hvl.dat100.javel.oppgave2;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */
        System.out.println("A) Månedlig strømforbruk");
        MonthlyPower.print_PowerUsage(power_usage_month);

        System.out.println("B) Månedlig strømpriser"); 
        MonthlyPower.print_PowerPrices(power_prices_month);  
        
        System.out.println("C) Total månedlig forbruk");
        System.out.printf("%.2f kWh%n", MonthlyPower.computePowerUsage(power_usage_month));
        System.out.println("");

        double threshold = 5000;
        System.out.println("D) Forbrukgrense");
        System.out.println(MonthlyPower.exceedThreshold(power_usage_month, threshold));

        System.out.println("E Spotpris for måneden");
    }
}