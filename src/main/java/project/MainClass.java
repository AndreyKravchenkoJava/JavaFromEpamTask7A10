package project;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Numbers numbers = (int a, int b, int c) -> {
            int max = a;
            if (max < b) max = b;
            if (max < c) max = c;
            return max;
        };

        int result = numbers.numbers(58, 66, 22);
        System.out.println(result);
    }
}
