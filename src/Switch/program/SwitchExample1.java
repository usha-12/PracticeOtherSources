package Switch.program;

import java.util.Scanner;

public class SwitchExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        switch (number){
            case (12):
                if (number%2==0){
                    System.out.println("Number is Even");
                }else {
                    System.out.println("Number is Odd");
                }
                break;
            case (-12):
                if (number>0){
                    System.out.println("Number is Positive");
                }
                else if (number<0) {
                    System.out.println("Number is Negative");
                }
                else
                    System.out.println("Number is Zero");
                break;
            default:
                System.out.println("Please Enter valid number");


        }
    }
}
