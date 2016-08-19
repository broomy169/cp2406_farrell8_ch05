import java.util.Scanner;

/**
 * Created by Graeme on 19/08/2016.
 */
public class AscendingAndDescending {
    public static void main(String[] args) {
        int low, med, high;

        Scanner input = new Scanner(System.in);

        System.out.print("First number: ");
        int a = input.nextInt();
        System.out.print("Second number: ");
        int b = input.nextInt();
        System.out.print("Third number: ");
        int c = input.nextInt();

        if(a <= b && a <= c) {
            low = a;
            if(b <= c) {
                med = b;
                high = c;
            } else {
                med = c;
                high = b;
            }
        } else {
            if(b <= a && b <= c) {
                low = b;
                if(a <= c) {
                    med = a;
                    high = c;
                } else {
                    med = c;
                    high = a;
                }
            } else {
                low = c;
                if(a <= b) {
                    med = a;
                    high = b;
                } else {
                    med = b;
                    high = a;
                }
            }
        }
        System.out.println("Ascending: " + low + ", " + med + ", " + high);
        System.out.println("Descending: " + high + ", " + med + ", " + low);
    }
}
