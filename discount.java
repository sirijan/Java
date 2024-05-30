import java.util.Scanner;
public class discount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount:");
        int amnt = sc.nextInt();
        double pay=0;
        if(amnt>1000){
            pay = amnt*0.2;
        }
        else if(amnt>500&&amnt<1000){
            pay = amnt*0.1;
        }
        else
            pay = amnt;
        System.out.println("To Pay:  "+pay);

    }

}
