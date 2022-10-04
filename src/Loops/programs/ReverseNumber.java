package Loops.programs;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 23597;
        int reverse = 0;
        while (number>0){
            int remainder = number%10;
            number = number/10;
            reverse = reverse*10+remainder;
        }
        System.out.println(reverse);

    }
}
/*number = 23597
* 1. 7*10+9 = 79
* 2. 79*10+5 = 795
* 3. 795*10+3 = 7953
* 4. 7953*10+2 = 79532 */