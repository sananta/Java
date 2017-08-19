import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner nums = new Scanner(System.in);
        int elements = nums.nextInt();
        
        double mean = 0.0;
        double median = 0.0;
        double[] sorted_array = new double[elements];
        int mode = 0; 
        int max = 1; 
        //mean and mode 
        Map<Double, Integer> number = new HashMap<>();
        for (int i = 0; i < elements; i++) {
            sorted_array[i] = nums.nextDouble();
            mean = mean + sorted_array[i];
            if (number.get(sorted_array[i]) != null) {
                int count = number.get(sorted_array[i]); 
                count = count + 1;
                number.put(sorted_array[i], count);
                if (count > max || count == max && mode > sorted_array[i]) {
                    max = count; 
                    mode = (int)sorted_array[i];
                }
            }
            else {
                number.put(sorted_array[i], 1);
            } 
        }
        mean = mean/elements;
        //median
        Arrays.sort(sorted_array);
        if (mode == 0.0) {
            mode = (int)sorted_array[0];
        }
        if (elements % 2 == 1) 
            median = sorted_array[(int)Math.ceil(elements/2)];
        else 
            median = (sorted_array[elements/2] + sorted_array[(elements/2)-1])/2;
        
        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);     
    }
}
