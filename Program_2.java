//this code is return in java language
import java.util.Scanner;

class Program_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = s.nextInt();

        for (int i = 1; i <= a; i++) {
            int odd = 2 * i - 1;  
            System.out.print(odd);

            // Print comma for all except last
            if (i < a) {
                System.out.print(", ");
            }
        }
        system.out.println();
    }
}

