import java.util.Scanner;
public class The {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter physics numbers: ");
    int physics = sc.nextInt();
    System.out.println("Ener maths numbers: ");
    int maths = sc.nextInt();
    System.out.println("Enter eco numbers: ");
    int eco = sc.nextInt();
    double percentage = (( physics + maths + eco)/300.0)*100;
    System.out.println("percentage: ");
    System.out.println(percentage);
}
}