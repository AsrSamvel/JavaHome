// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Homework001;

import java.util.Scanner;

public class task1 {
  public static void main(String[] args) {
      int sum = 0;
      int prz = 1;
      System.out.println("До какого числа производить расчет?");
      Scanner inputNumber = new Scanner(System.in);
      int n = inputNumber.nextInt();
      int a = n;
      while (n != 0) {
        sum += n;
        n -= 1;
      }
      while (a != 1) {
        prz *= a;
        a -= 1;
      }
     System.out.println("Сумма чисел =" + sum); 
     System.out.println("Произведение чисел =" + prz); 
  }
}
