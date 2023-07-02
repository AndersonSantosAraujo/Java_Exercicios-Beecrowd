
/*
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

Entrada
A entrada contém vários casos de teste. Cada caso de teste contém 2 valores inteiros.

Saída
Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, conforme o exemplo.

Exemplo de Entrada	Exemplo de Saída
  2 2                primeiro
  3 -2               quarto
  -8 -1              terceiro
  -7 1               segundo
  0 2
*/
import java.util.Scanner;

public class BC1115 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    double x, y;

    do {
      x = input.nextDouble();
      y = input.nextDouble();

      if (x > 0 && y > 0) {
        System.out.print("primeiro\n");
      } else if (x < 0 && y > 0) {
        System.out.print("segundo\n");
      } else if (x < 0 && y < 0) {
        System.out.print("terceiro\n");
      } else if (x > 0 && y < 0) {
        System.out.print("quarto\n");
      }
    } while (x != 0 && y != 0);

    input.close();
  }
}