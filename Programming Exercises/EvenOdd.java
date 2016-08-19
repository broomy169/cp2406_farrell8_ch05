import java.util.Scanner;

/**
 * Created by Graeme on 19/08/2016.
 */
public class EvenOdd {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);

        System.out.print("Choose a number: ");
        i = input.nextInt();

        if (i % 2 == 0) {
            System.out.println("Number is even.");
        } else {
            System.out.println("Number is odd.");
        }
    }
}
