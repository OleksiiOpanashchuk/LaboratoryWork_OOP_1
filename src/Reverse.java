import java.util.Scanner;

public class Reverse {
    public static void main(String args[]) {
        int num, reverse = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть трьохзначне число: ");
        num = in.nextInt();

        while(num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num/10;
        }

        System.out.println("Реверснуте число: " + reverse);
    }
}
