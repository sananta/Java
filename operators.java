import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        double tipPercent = scan.nextInt(); // tip percentage
        double taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        tipPercent = (mealCost * ((double)tipPercent/100));
        taxPercent = (mealCost * ((double)taxPercent/100));
        mealCost = mealCost + tipPercent + taxPercent;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost);
      
        // Print your result
        System.out.println("The total meal cost is "+ totalCost +" dollars.");
      
    }
}
