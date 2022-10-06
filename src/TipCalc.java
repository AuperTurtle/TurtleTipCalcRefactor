import java.io.InputStream;

public class TipCalc {
    private double totalBillBeforeTip;
    private int tipPercent;
    private int numOfPeople;
    private double mealCost;

    public TipCalc(int tipPercent, int numOfPeople) {
        this.tipPercent = tipPercent;
        this.numOfPeople = numOfPeople;
    }

        public double getTotalBillBeforeTip () {
        return totalBillBeforeTip;
        }

        public int getTipPercentage() {
        return tipPercent;
        }

        public void addMeal(double mealCost) {
        if (mealCost > 0) {
            totalBillBeforeTip = (totalBillBeforeTip + mealCost);
        }
        }
    }

