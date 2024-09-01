import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;

public class NumberExercise {
    static List<Integer> numbers = new ArrayList<>();

    public void importData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhập phần tử thứ " + (i + 1));
            int number = sc.nextInt();
            numbers.add(number);
        }
    }

    public void prinData() {
        System.out.println(numbers);
    }

    public void findMax2() {
        sort(numbers);
        System.out.println("phần tử lớn thứ 2 là " + numbers.get(numbers.size() - 2));
    }

    public void deleteOddNumber() {
        numbers.removeIf(number -> number % 2 != 0);
        System.out.println(numbers);
    }

}
