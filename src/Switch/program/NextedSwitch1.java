package Switch.program;

import java.util.Scanner;

public class NextedSwitch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String department = sc.next();
        switch (empId){
            case 1:
                System.out.println("usha ");
                break;
            case 2:
                System.out.println("rahul");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("management department");
                        break;
                    default:
                        System.out.println("No department Exit");
                }
                break;
            default:
                System.out.println("Enter Current Emp Id");
        }
    }

}
