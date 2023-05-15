import java.util.Scanner;

public class outputtingab {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.printf("a = %d\nb = %d\n",a,b);
        }
    }
}
