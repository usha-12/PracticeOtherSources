package Loops.programs;

import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int first = 0;
        int second = 1;
        int count = 2;
        while (count<=number){
            int temp = second;
            second = second+first;
            first = temp;
            count++;

        }
        System.out.println(second);
    }
}
