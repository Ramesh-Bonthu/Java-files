import java.util.Scanner;

public class PermAndComb {
  public int fact(int n) {
    int fac = 1;
    for (int i = n; i >= 1; i--) {
      fac = fac * i;
    }
    return fac;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PermAndComb obj = new PermAndComb();
    int n, r;
    System.out.print(" Enter the n value : ");
    n = sc.nextInt();
    System.out.print(" Enter the r value : ");
    r = sc.nextInt();
    if (n >= r) {
      int nr = n - r;
      int nFact = obj.fact(n);
      int nrFact = obj.fact(nr);
      int rFact = obj.fact(r);
      System.out.println(" permutations is " + nFact / nrFact);
      int comb = rFact * nrFact;
      System.out.println(" Combinations is " + nFact / comb);
    } else {
      System.out.println(" N value is must be greater then R value");
    }
    sc.close();
  }
}
