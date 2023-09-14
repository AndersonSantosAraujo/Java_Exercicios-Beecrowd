/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido. 

Exemplo de Entrada	Exemplo de Saída
556                       0:9:16
1                         0:0:1
140153                    38:55:53
*/

import java.util.Scanner;

public class BC1019 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    // vars
    int entry, seconds, minutes, hours, rest;

    // data input
    entry = input.nextInt();

    // calc
    hours = entry / 3600;
    rest = entry % 3600;
    minutes = rest / 60;
    rest = entry % 60;
    seconds = rest;

    // data output
    System.out.printf("%d:%d:%d\n", hours, minutes, seconds);

    input.close();
  }
}
