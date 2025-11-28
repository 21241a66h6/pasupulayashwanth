//this code is return in java language
import java.util.*;

public class Program_4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Dictionary using HashMap
        Map<Integer, Integer> result = new LinkedHashMap<>();

        // Loop from 1 to 9
        for (int i = 1; i <= 9; i++) {
            int count = 0;

            for (int num : arr) {
                if (num % i == 0) {
                    count++;
                }
            }

            result.put(i, count);
        }

        // Print result
        System.out.println(result);
    }
}
