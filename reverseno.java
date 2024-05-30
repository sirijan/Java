import java.util.Scanner;
public class reverseno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");

        int a = sc.nextInt();
        int rem = 0;
        System.out.print("Reversed Number: ");

        while(a!=0){
          rem = a%10;
            System.out.print(rem);
            a = a/10;
        }

    }
}
