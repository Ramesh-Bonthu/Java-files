import java.util.Scanner;

public class SumOfFirstNaturalNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    System.out.print(" Enter the n value to sum : ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      sum = sum + i;
    }
    System.out.println("Sum of first n natural numbers is " + sum);
    sc.close();
  }
}
