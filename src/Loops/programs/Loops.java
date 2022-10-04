package Loops.programs;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Q:-
        /*for(initialisation: condition;){
        //body
        }*/
        /* Q:- print number from 1 to 5
        for (int num = 1; num <= 20; num+=1){
            System.out.println(num);
        }
         */
        // print number from 1 to n....
        /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int num =1; num <= n; num+=1){// how many times going to run loops then use for loop
            //System.out.println(num);
            System.out.println("hello world");
        }
         */
/*        int num = 1;
        while (num<=10){//when you do not know how many times you will be run loops then use while
            System.out.println(num);
            num +=2;
        }
        */

        int num = 1;
        do {// at least one time loop running
            System.out.println("hello world");
        }while (num!=1);

    }
}
