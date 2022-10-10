
public class TipCalc {
    private double totalBillBeforeTip;
    private int tipPercent;
    private int numOfPeople;
    private double mealCost;
    private double totalTip;
    private double totalBillAfterTip;
    private double perPersonCostBeforeTip;
    private double perPersonTipAmount;
    private double perPersonTotalCost;

    public TipCalc(int tipPercent, int numOfPeople) {
        this.tipPercent = tipPercent;
        this.numOfPeople = numOfPeople;
        this.totalBillBeforeTip = 0;
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

        public double tipAmount() {
            totalTip = ((double) getTipPercentage() / 100) * getTotalBillBeforeTip();
            return totalTip;
        }

        public double totalBill() {
            totalBillAfterTip = (tipAmount() + getTotalBillBeforeTip());
            return totalBillAfterTip;
        }
        public double perPersonCostBeforeTip() {
            perPersonCostBeforeTip = (getTotalBillBeforeTip() / numOfPeople);
            return perPersonCostBeforeTip;
        }
        public double perPersonTipAmount() {
            perPersonTipAmount = (tipAmount() / numOfPeople);
            return  perPersonTipAmount;
        }

        public double perPersonTotalCost() {
            perPersonTotalCost = (totalBill() / numOfPeople);
            return perPersonTotalCost;
        }
    }

