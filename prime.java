import java.util.Scanner;

class prime {
  public static void main(String[] args) {
    int i, n, temp = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the number : ");
    n = sc.nextInt();
    for (int j = 2; j < n; j++) {
      temp = 0;
      for (i = 2; i < j; i++) {
        if (j % i == 0) {
          temp++;
          break;
        }
      }
      if (temp == 0) {
        System.out.println(j);
      } else {
        System.out.println(" ");
      }
    }
    sc.close();
  }
}