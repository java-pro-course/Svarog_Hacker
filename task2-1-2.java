import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int secretCode = 123;
        int n;
        do{
            n = in.nextInt();
            if(n==secretCode){
                System.out.println("Correct number!");
            }else{
                System.out.println("Incorrect number!");
            }
        }while(n!=secretCode);
    }
}