package burns.chris;
import java.util.Scanner;

public class sumofthenumbers {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");

        int n = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.print(sum);
    }
}


