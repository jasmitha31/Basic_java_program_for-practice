import java.util.Scanner;
public class assesment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            int square = number * number;
            System.out.println("Square of the number: " + square);
        } catch (Exception e) {
            System.out.println("Please enter valid data");
        } finally {
            sc.close();
        }
    }
}
