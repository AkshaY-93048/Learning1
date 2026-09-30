import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        double s1 = sc.nextDouble();

        System.out.print("Enter marks of Subject 2: ");
        double s2 = sc.nextDouble();

        System.out.print("Enter marks of Subject 3: ");
        double s3 = sc.nextDouble();

        System.out.print("Enter marks of Subject 4: ");
        double s4 = sc.nextDouble();

        System.out.print("Enter marks of Subject 5: ");
        double s5 = sc.nextDouble();

        double average = (s1 + s2 + s3 + s4 + s5) / 5;

        double cgpa = average / 10;

        System.out.println("Average Marks = " + average);
        System.out.println("CGPA = " + cgpa);

        sc.close();
    }
}
