import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(multiFive(n));
    }
    public static int multiFive (int n){
        return n*5;
    }
}