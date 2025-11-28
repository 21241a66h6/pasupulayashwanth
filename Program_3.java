//this code is return in java language
import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = s.nextInt();

        int limit;

        if (a % 2 == 0) {     
            // even → largest odd is a-1
            limit = a - 1;
        } else {
            // odd → largest odd is a
            limit = a;
        }

        for (int i = 1; i <= limit; i += 2) {
            System.out.print(i);

            if (i < limit) {
                System.out.print(", ");
            }
        }
    }
}
S