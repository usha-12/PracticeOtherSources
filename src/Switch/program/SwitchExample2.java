package Switch.program;

import java.util.Scanner;

public class SwitchExample2 {// This is Example of enhance switch statement ( Alt+Enter )
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day:");
        int day = sc.nextInt();
        /*switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
         */
      /*  switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Week Day");
                break;
            case 6:
            case 7:
                System.out.println("Weekend day");
                break;
        }

       */
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Week Day");
            case 6, 7 -> System.out.println("Weekend day");
        }
    }
}
