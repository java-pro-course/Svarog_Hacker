import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i < n; i++) {
            if(isEven(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isEven (int SSS){
        return SSS % 2 == 0;
    }
}