package Cycle2;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        System.out.println("Enter value");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        int sum= 0;
        for (int i = 1; i <= value; ++i) {
            if (i % 2 != 0) {
              sum=i+sum;
            }


        }
        System.out.println(sum);
    }
}
