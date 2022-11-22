import java.util.Scanner;

public class nested_switch_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your EmpID: ");
        int EmpId = in.nextInt();
        String Department = in.next();

        switch (EmpId){
            case 1:
                System.out.println("gaurav");
                break;
            case 2 :
                System.out.println("rahul");
                break;
            case 3:
                switch (Department){
                    case "IT":
                        System.out.println("IT department ");
                        break;
                    case "CSE ":
                        System.out.println(" computer sceince and engineering department");
                        break;
                    default:
                        System.out.println("enter a correct department ");
                }
                break;
            default:
                System.out.println("enter a correct department ");
        }

    }
}
