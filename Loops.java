import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age) {
            case 10:
                System.out.println("come home early");
                break;
             case 15:
                    System.out.println("come late");
                break;
             case 20:
                        System.out.println("aawo ya matt aawo");
                 break;
              case 25:
                            System.out.println("ghr pe hiy mtt rho");
                break;
              default:
                                System.out.println("jo mn me aaye wo kro");

        }
    }
    
}
