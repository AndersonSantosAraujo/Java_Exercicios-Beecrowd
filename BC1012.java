
/*
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.

Exemplos de Entrada	  Exemplos de Saída
3.0 4.0 5.2           TRIANGULO: 7.800
                      CIRCULO: 84.949
                      TRAPEZIO: 18.200
                      QUADRADO: 16.000
                      RETANGULO: 12.000

12.7 10.4 15.2        TRIANGULO: 96.520
                      CIRCULO: 725.833
                      TRAPEZIO: 175.560
                      QUADRADO: 108.160
                      RETANGULO: 132.080
 */
import java.util.Scanner;

public class BC1012 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    double A, B, C, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

    A = input.nextDouble();
    B = input.nextDouble();
    C = input.nextDouble();

    areaTriangulo = (A * C) / 2;
    areaCirculo = 3.14159 * C * C;
    areaTrapezio = ((A + B) * C) / 2;
    areaQuadrado = B * B;
    areaRetangulo = A * B;

    System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
    System.out.printf("CIRCULO: %.3f\n", areaCirculo);
    System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
    System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
    System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

    input.close();
  }
}