import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(isPrime(n)){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
    
    public static boolean isPrime (int SSS){
        int c = 0;
        for (int i = 1; i < SSS; i++) {
            if(SSS%i == 0) c++;
        }
        return c == 1;
    }
}