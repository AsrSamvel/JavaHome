// Реализовать простой калькулятор

package Homework001;

import java.util.Scanner;


public class task3 {

  static int choose(String znak, int num1, int num2) {
    int result = 0;
    switch (znak) {
      case "+":
        result = num1 + num2;
        break;
      case "-":
        result = num1 - num2;
        break;
      case "*":
        result = num1 * num2;
        break;
      case "/":
        if (num2 == 0) {
          System.out.println("Ошибка! На 0 делить нельзя!");
        } else {
          result = num1 / num2;
          break;
        }
        
    }
    return result;
  }
  public static void main(String[] args) {
    System.out.println("Введите первое число: ");
    Scanner number1 = new Scanner(System.in);
    int a = number1.nextInt();

    System.out.println("Введите оператор: - + * /");
    Scanner operation = new Scanner(System.in);
    String znaki = operation.nextLine();

    System.out.println("Введите второе число: ");
    Scanner number2 = new Scanner(System.in);
    int b = number2.nextInt();

    int result = choose(znaki, a, b);
    
    System.out.println(a + " " + znaki + " " + b  + " " + "=" + " " + result);
  }
}  

    