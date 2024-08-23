import java.util.Scanner;

public class PermAndComb {
  public double fact(int n) {
    double fac = 1;
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
      double nFact = obj.fact(n);
      double nrFact = obj.fact(nr);
      double rFact = obj.fact(r);
      System.out.println(" permutations is " + nFact / nrFact);
      double comb = rFact * nrFact;
      System.out.println(" Combinations is " + nFact / comb);
    } else {
      System.out.println(" N value is must be greater then R value");
    }
    sc.close();
  }
}
