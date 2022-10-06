import java.util.Scanner;
import java.text.DecimalFormat;
//imports java utils (scanner + DecimalFormat)
public class TipCalcRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        //initializes the java utils

        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group?");
        int people = scan.nextInt();
        scan.nextLine();
        while (people < 1) {
            System.out.println("Number of people has to be a positive and greater than zero, try again.");
            people = scan.nextInt();
        }
        //start of the program asks for people and limits the number of people greater than zero

        System.out.println("What's the tip percentage? (0-100):");
        int tipPercent = scan.nextInt();
        while ((tipPercent < 0) || (tipPercent > 100)) {
            System.out.println("Tip percentage has to be between 0 and 100.");
            tipPercent = scan.nextInt();
        }

        TipCalc tipCalc = new TipCalc(tipPercent,people);

        //sets tip percent to value not negative or over 100%

        double checkEnd = 0;
        double totalCost = 0;
        while (checkEnd != -1) {
            System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end):");
            checkEnd = scan.nextDouble();
            if (checkEnd > 0) {
                totalCost = (totalCost + checkEnd);
            }
        }
        //enter the things bought and adds up the values to a totalCost before tips.

        System.out.println("----------------------------------------------------");

        String roundedTotalCost = formatter.format(totalCost);
        double totalTip = ((double) tipPercent / 100) * totalCost;
        String roundedTotalTip = formatter.format(totalTip);
        double totalBillWithTip = (totalTip + totalCost);
        String roundedTotalBillWithTip = formatter.format(totalBillWithTip);
        double perPersonBeforeTip = (totalCost / people);
        String roundedPerPersonBeforeTip = formatter.format(perPersonBeforeTip);
        double tipPerPerson = (totalTip / people);
        String roundedTipPerPerson = formatter.format(tipPerPerson);
        double totalCostPerPerson = (totalBillWithTip / people);
        String roundedTotalCostPerPerson = formatter.format(totalCostPerPerson);
        //calculates values per person such as tips and total cost

        System.out.println("Total Bill Before Tip: " + roundedTotalCost);
        System.out.println("Tip Percentage: " + tipCalc.getTipPercentage());
        System.out.println("Total Tip: " + roundedTotalTip);
        System.out.println("Total Bill with Tip: " + roundedTotalBillWithTip);
        System.out.println("Per Person Cost Before Tip: " + roundedPerPersonBeforeTip);
        System.out.println("Tip Per Person: " + roundedTipPerPerson);
        System.out.println("Total Cost Per Person: " + roundedTotalCostPerPerson);
        //prints out the final values that are rounded



    }
}