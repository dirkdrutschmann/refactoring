package refactor;

public class Refactoring {

    final static double REFERENCE_PRICE = 3.49;
    final static double TAX = 1.19;

    public static void main(String[] args) {	
		double[] prices = {1.29, 2.49, 4.18, 5.79};
		for(int i = 0; i < prices.length; i++) {
			System.out.print("Bruttopreis: " + prices[i])
            System.out.print(" Nettopreis:" + calcBruttoNetto(prices[i]));
            compareDoubles(REFERENCE_PRICE,prices[i]);
		}

       
	}

    public static void compareDoubles(double first, double second) {
        if (first > second) {
            System.out.println("higher");
        } else if (second > first) {
            System.out.println("lower");
        } else {
            System.out.println("equals");
        }
    }

    public static double calcBruttoNetto(double brutto) {
        return brutto / TAX;

    }

}
