import java.util.ArrayList;

public class PriceTotal {
    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(10.5);
        prices.add(250.0);
        prices.add(0.0);

        double total = 0;
        for(double p : prices) {
            total = total + p;
        }
        System.out.println("Total = " + total);
    }
}
