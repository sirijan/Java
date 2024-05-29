import java.util.Scanner;
public class negative {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int i = obj.nextInt();
        if(i<0){
            System.out.println("The Given Number is Negative");
        }else
            System.out.println("The Given Number is Positive");
    }
}
