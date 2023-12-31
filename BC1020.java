/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.

Exemplo de Entrada	Exemplo de Saída
      400             1 ano(s)
                      1 mes(es)
                      5 dia(s)

      800             2 ano(s)
                      2 mes(es)
                      10 dia(s)

      30              0 ano(s)
                      1 mes(es)
                      0 dia(s)
*/

import java.util.Scanner;

public class BC1020 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    // vars
    int age, days, months, years, rest;

    // data input
    age = input.nextInt();

    // calc
    years = age / 365;
    rest = age % 365;
    months = rest / 30;
    rest = rest % 30;
    days = rest;

    // data output
    System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", years, months, days);

    input.close();
  }
}
