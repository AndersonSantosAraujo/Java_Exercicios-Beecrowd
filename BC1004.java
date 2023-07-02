import java.util.Scanner;

public class BC1004 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int A, B, PROD;

    A = input.nextInt();
    B = input.nextInt();
    PROD = A * B;

    System.out.println("PROD = " + PROD);

    input.close();
  }
}
