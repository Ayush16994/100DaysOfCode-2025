import java.util.*;

public class Day_33_Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int result = n & (n - 1);

        System.out.println("After clearing rightmost set bit: " + result);
    }
}
