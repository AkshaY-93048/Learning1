import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject1 numbers: ");
        int subject1 = sc.nextInt();
        System.out.println("Enter subject2 numbers: ");
        int subject2 = sc.nextInt();
        double percentage = ((subject1 + subject2)/200.0)*100;
        System.out.println("percentage: ");
        System.out.println(percentage);
    }
}
