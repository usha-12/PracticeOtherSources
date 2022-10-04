package Loops.programs;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take input from the user till user does not press x or x
        int ans = 0;
        while (true){
            //take the operator as input
            System.out.println("Enter the operator:");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //input two number
                System.out.println("Enter First number:");
                int num1 = sc.nextInt();
                System.out.println("Enter Second number:");
                int num2 = sc.nextInt();
                if (op == '+'){
                    System.out.println("Addition of Two Number:");
                    ans = num1 + num2;
                }
                if (op == '-'){
                    System.out.println("Subtraction of Two Number: ");
                    ans = num1 - num2;

                }
                if (op == '*'){
                    System.out.println("Multiplication of Two Number:");
                    ans = num1 * num2;
                }
                if(op == '/') {
                    if (num2 != 0) {
                        System.out.println("Division of Two Number:");
                        ans = num1 / num2;
                    }
                }
                    if (op == '%'){
                        System.out.println("Modulus of Two Number:");
                        ans = num1 % num2;
                    }
                } else if (op == 'x' || op == 'X'){
                break;
            }else  {
                System.out.println("Invalid operation");
            }
            System.out.println(ans);
        }

    }
}
