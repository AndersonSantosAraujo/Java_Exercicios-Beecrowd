/*
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem. 

Exemplos de Entrada	Exemplos de Saída
10.0 20.1 5.1       R1 = -0.29788
                    R2 = -1.71212

0.0 20.0 5.0        Impossivel calcular

10.3 203.0 5.0      R1 = -0.02466
                    R2 = -19.68408

10.0 3.0 5.0        Impossivel calcular
*/

import java.util.Scanner;

public class BC1036 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    // vars
    double A, B, C, R1, R2, sqrt;

    // input data
    A = input.nextDouble();
    B = input.nextDouble();
    C = input.nextDouble();

    // calc
    sqrt = Math.sqrt((B * B) - (4 * A * C)); // √b²-4.a.c
    R1 = (-B + sqrt) / (2 * A);
    R2 = (-B - sqrt) / (2 * A);

    // output data
    if (Double.isNaN(R1) || Double.isNaN(R2) || Double.isInfinite(R1) || Double.isInfinite(R2)) {
      System.out.println("Impossivel calcular");
    } else {
      System.out.printf("R1 = %.5f\nR2 = %.5f\n", R1, R2);
    }

    input.close();
  }
}
