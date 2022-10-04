package Loops.programs;
import java.util.Scanner;
public class LargestOfThree {
    public static void checkLargestNumber(){

        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second Number:");
        int num2 = sc.nextInt();
        System.out.println("Enter third Number:");
        int num3 = sc.nextInt();
        System.out.println("Enter fourth number:");
        int num4 = sc.nextInt();
        //1.
       /* int max = num1;
        if (num2>max){
            max = num2;
        }
        if (num3>max){
            max = num3;
        }

        */
        //2.
        /*int max = 0;
        if (num1 > num2){
            max = num1;
        }else {
            max = num2;
        }
        if (num3>max){
            max = num3;
        }*/
       /* int max = Math.max(num1,Math.max(num2,Math.max(num3,num4)));
        System.out.println("Largest Number is :"+max);

        */
    }
}
