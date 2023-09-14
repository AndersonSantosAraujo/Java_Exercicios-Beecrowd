/*
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = {}  {   sqrt{ (x2 - x1)^2 + (y2 - y1)^2 }}

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
1.0 7.0                 4.4721
5.0 9.0

-2.5 0.4                16.1484
12.1 7.3

2.5 -0.4                16.4575
-12.2 7.0
*/

import java.util.Scanner;

public class BC1015 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    double x1, x2, y1, y2, distancia;

    x1 = input.nextDouble();
    y1 = input.nextDouble();
    x2 = input.nextDouble();
    y2 = input.nextDouble();

    distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    System.out.printf("%.4f\n", distancia);

    input.close();
  }
}
