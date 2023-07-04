package Homework003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1 {

    static void DelChet(List<Integer> arrList) {
        for (int i = 0; i < arrList.size() - 1; i++) {
            if (arrList.get(i) % 2 == 0) {
                arrList.remove(i);
            }
        }
        System.out.println("Список - без четных чисел" + arrList);

    }

    static Integer MaxNum(List<Integer> arrList) {
        int max = arrList.get(0);
        for (int i = 0; i < arrList.size() - 1; i++) {
            if (arrList.get(i) > max) {
                max = arrList.get(i);
            }
        }
        return max;
    }

    static Integer MinNum(List<Integer> arrList) {
        int min = arrList.get(0);
        for (int i = 0; i < arrList.size() - 1; i++) {
            if (arrList.get(i) < min) {
                min = arrList.get(i);
            }
        }
        return min;
    }

    static Double Sredn(List<Integer> arrList) {
        int sum = 0;
        double srednee;
        for (int i = 0; i < arrList.size() - 1; i++) {
            sum += arrList.get(i);
        }
        srednee = sum / arrList.size();
        return srednee;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList(Arrays.asList(5, 13, 3, 44, 22, 32, 1, 99, 54, 5, 3));
        System.out.println("Начальный список: " + list);
        System.out.println("Минимальное значение: " + MinNum(list));
        System.out.println("Максимальное значение: " + MaxNum(list));
        System.out.println("Среднее значение: " + Sredn(list));
        DelChet(list);
    }
}
