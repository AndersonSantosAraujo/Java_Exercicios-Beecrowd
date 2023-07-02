import java.util.Scanner;

public class BC1003 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int A, B, SOMA;

    A = input.nextInt();
    B = input.nextInt();
    SOMA = A + B;

    System.out.println("SOMA = " + SOMA);

    input.close();
  }
}