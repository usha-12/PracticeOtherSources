package Loops.programs;

public class CountNumbers {
    public static void main(String[] args) {
        int number = 45536;
        int count = 0;
        while (number>0) {
            int rem = number % 10;//last digit of number
            if (rem == 5) {
                count++;
            }
            number = number / 10;
        }
        System.out.println(count);

    }

}
//45536%10=6
//4553%10=3
//455%10=5
//45%10=5
//4%10=4