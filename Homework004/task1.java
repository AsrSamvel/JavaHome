// Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа должны быть отрицательными.

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class task1 {
   static int turnInt(Deque<String> arr) {
    int result = 0; 
    String inS; 
    int krat = 1;

    while (arr.size() != 0) {
      inS = arr.pollFirst();
      if (!inS.equals("-")) {
        result = result + krat * (Integer.parseInt(inS));
        krat *= 10;
      } else {
        result *= -1;
      }
    }
    return result;
  }

  static Queue<String> unpack(int a) {
    Deque<String> q = new LinkedList<>();
    int temp = 0;
    boolean negative = false;
    if (a < 0) {
      a *= -1;
      negative = true;
    }
    while (a > 0) {
      temp = a % 10;
      a = (a - temp) / 10;
      q.addFirst(Integer.toString(temp));
    }
    if (negative) {
      q.addFirst("-");
    }
    return q;
  }

  public static void main(String[] args) {

    Deque<String> list_1 = new LinkedList<>(Arrays.asList("7", "5", "3"));
    Deque<String> list_2 = new LinkedList<>(Arrays.asList("9", "2", "-"));

    System.out.println("Обратный порядок чисел: " + list_1 + ", " + list_2);
    System.out.println();

    int first_num = turnInt(list_1);
    int second_num = turnInt(list_2);
    int pr_result = first_num * second_num;
    int sum_result = first_num + second_num;
    System.out.printf("%d * %d = %d\n", first_num, second_num, pr_result);
    System.out.printf("%d + %d = %d\n", first_num, second_num, sum_result);

    System.out.println();
    System.out.println("Произведение чисел: ");
    System.out.println(unpack(pr_result));
    System.out.println("Сумма чисел: ");
    System.out.println(unpack(sum_result));

  }
}
