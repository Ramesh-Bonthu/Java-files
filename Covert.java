import java.util.Scanner;

public class Covert {
  void feetMeter(int feet) {
    double feet1 = feet * 0.3048;
    System.out.println(feet + " feets is approxmately " + feet1 + " meters");
  }

  void meterFeet(int meter) {
    double meter1 = meter / 0.3048;
    System.out.println(meter + " meters is approxmately " + meter1 + " feets");
  }

  void mileKilo(int mile) {
    double mile1 = mile * 1.60934;
    System.out.println(mile + " miles is approxmately " + mile1 + " kilometers");
  }

  void kiloMile(int kilo) {
    double kilo1 = kilo / 1.60934;
    System.out.println(kilo + " kilometers is approxmately " + kilo1 + " miles");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Covert obj = new Covert();
    int choice;
    System.out.println(" Measuring the conversion utility ");
    System.out.println(" Enter only positive numbers throughtout program ");
    System.out.println("1.Feet to meters \n 2.Meters to feet ");
    System.out.println("3.Miles to kilometers \n 4.Kilometers to miles ");
    System.out.print(" Enter the chioce : ");
    choice = sc.nextInt();
    switch (choice) {
      case 1:
        System.out.print(" Enter the distance in feets : ");
        int feet = sc.nextInt();
        obj.feetMeter(feet);
        break;
      case 2:
        System.out.print(" Enter the distance in meters : ");
        int meter = sc.nextInt();
        obj.meterFeet(meter);
        break;
      case 3:
        System.out.print(" Enter the distance in miles : ");
        int mile = sc.nextInt();
        obj.mileKilo(mile);
        break;
      case 4:
        System.out.print(" Enter the distance in kilometers : ");
        int kilo = sc.nextInt();
        obj.kiloMile(kilo);
        break;
      default:
        System.out.println(" Enter the correct number ");
        break;
    }
    sc.close();
  }
}
