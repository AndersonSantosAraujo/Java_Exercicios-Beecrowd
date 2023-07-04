import java.util.Scanner;

public class BC1006 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    double A, B, C, MEDIA;

    A = input.nextDouble();
    B = input.nextDouble();
    C = input.nextDouble();
    MEDIA = (A * 2.0 + B * 3.0 + C * 5.0) / 10;

    System.out.printf("MEDIA = %.1f\n", MEDIA);

    input.close();
  }
}