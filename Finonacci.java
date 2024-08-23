import java.util.Scanner;

public class Finonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = 1, n2 = 1, n3;
    System.out.print("Enter the value of fibo : ");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      n3 = n1 + n2;
      System.out.println(" " + n3);
      n1 = n2;
      n2 = n3;
    }
    sc.close();
  }
}
