
/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

Exemplos de Entrada	Exemplos de Saída
7 14 106            106 eh o maior
217 14 6            217 eh o maior
*/
import java.util.Scanner;

public class BC1013 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    int a, b, c, maior;

    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();

    maior = (a + b + Math.abs(a - b)) / 2;
    maior = (maior + c + Math.abs(maior - c)) / 2;

    System.out.printf("%d eh o maior\n", maior);

    input.close();
  }
}