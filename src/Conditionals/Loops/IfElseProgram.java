package Conditionals.Loops;

public class IfElseProgram {
    public static void main(String[] args) {
        //synatax of if statement
        /*if (boolean expression T and F){
        * //body
        * }else{
        * //do this*/
        int salary = 25400;
       /* if (salary>10000){
            salary= salary+2000;
        }else {
            salary = salary+1000;
        }
       */


        //Multiple if-else
        if (salary > 10000){
            salary = salary+2000;
        } else if (salary>20000) {
            salary= salary+3000;
        }else {
            salary = salary+1000;
        }
        System.out.println(salary);
    }
}
