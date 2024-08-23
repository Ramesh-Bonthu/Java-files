//package exp;

import java.time.LocalDate;

public class CheckTypeJava {

  public static void main(String[] args) {

    String var1 = "Welcome To Java Beat";

    Integer var2 = 2024;

    Double var3 = 12.2024;

    Float var4 = 2023.12f;
    int ram = 19;

    LocalDate var5 = LocalDate.now();

    CheckTypeJava obj = new CheckTypeJava();

    System.out.println("The Type of " + var1 + " : " + var1.getClass().getName());

    System.out.println("The Type of " + var2 + " : " + var2.getClass().getName());

    System.out.println("The Type of " + var3 + " : " + var3.getClass().getName());

    System.out.println("The Type of " + var4 + " : " + var4.getClass().getName());

    System.out.println("The Type of " + var5 + " : " + var5.getClass().getName());
    System.out.println("The Type of " + ram + " : " + ((Object) ram).getClass().getSimpleName());
    System.out.println("The Type of obj : " + obj.getClass().getName());

  }
}
