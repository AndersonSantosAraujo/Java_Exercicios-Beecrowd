import java.util.Scanner;

public class BC1014 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    int X;
    double Y, consumo;

    X = input.nextInt();
    Y = input.nextDouble();
    consumo = X / Y;

    System.out.printf("%.3f km/l\n", consumo);

    input.close();
  }
}