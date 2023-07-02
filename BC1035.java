
/*
Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

Entrada
Quatro números inteiros A, B, C e D.

Saída
Mostre a respectiva mensagem após a validação dos valores.

Exemplo de Entrada	Exemplo de Saída
5 6 7 8             Valores nao aceitos
2 3 2 6             Valores aceitos 
*/
import java.util.Scanner;

public class BC1035 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int A, B, C, D;

    A = input.nextInt();
    B = input.nextInt();
    C = input.nextInt();
    D = input.nextInt();

    if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && (A % 2) == 0) {
      System.out.print("Valores aceitos\n");
    } else {
      System.out.print("Valores nao aceitos\n");
    }

    input.close();
  }
}
