package Lesson_5.DZ;

import java.util.Scanner;

public class DZ_5_1 {
    public static void main(String[] args) {
    /*
    Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
Программа выводит слова на экран.
    * */
        String[] arr = new String[10];
        Scanner scanner = new Scanner(System.in);
        String string;
        int i = 0;
        while (true) {
            string = scanner.nextLine();
            if (string.equals("")) {
                break;
            }
            System.out.println(string);

            arr[i] = string;
            i++;
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != null) {
                String concat = arr[j].concat(arr[j]);
                if (arr[j].length() % 2 == 0) {
                    arr[j] = concat;
                } else {
                    arr[j] = concat.concat(arr[j]);
                }
            }
        }

    }
}


