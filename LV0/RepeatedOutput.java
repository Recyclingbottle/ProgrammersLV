import java.util.Scanner;

public class RepeatedOutput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.next();
            int n = sc.nextInt();
            for(int i = 0; i< n; i++){
                System.out.print(str);
            }
        }
    }
}
