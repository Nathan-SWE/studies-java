/*
Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

| **Renda (R$)**        | **Imposto de Renda** |
|-----------------------|---------------------|
| 0,00 a 2.000,00      | Isento              |
| 2.000,01 até 3.000,00 | 8%                  |
| 3.000,01 até 4.500,00 | 18%                 |
| Acima de 4.500,00    | 28%                 |

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.
*/

import java.util.Scanner;
import java.util.Locale;

public class TaxCalculator {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double salario = sc.nextDouble();
    sc.close();

    double imposto = 0.0;

    if (salario > 4500.00) {
      imposto += (salario - 4500.00) * 0.28;
      salario = 4500.00;
    }

    if (salario > 3000.00) {
      imposto += (salario - 3000.00) * 0.18;
      salario = 3000.00;
    }

    if (salario > 2000.00) {
      imposto += (salario - 2000.00) * 0.08;
    }

    if (imposto == 0.0) {
      System.out.println("Isento");
    } else {
      System.out.printf("R$ %.2f%n", imposto);
    }
  }
}
