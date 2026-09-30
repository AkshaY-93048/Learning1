import java.util.Scanner;
public class Agar {
    public static void main(String[] args) {
        int rate;
        System.out.println("Enter Your rate");
        Scanner sc = new Scanner(System.in);
        rate = sc.nextInt();
        switch(rate){
            case 25:
                System.out.println("mango");
                break;
                case 30:
                    System.out.println("Apple");
                    break;
                    case 35:
                    System.out.println("no no fruit");
                    break;
                    case 45:
                        System.out.println("yeah fruit");
                        break;
                        default: 
                        System.out.println("fuck you");
        }
    }
}
