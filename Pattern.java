import java.util.Scanner;
public class Pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");

        int n = sc.nextInt();
        for(int i=n,n1=n;i>=1;i--)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            for(int j=1;i!=1 && j<i;j++)
            {
                System.out.print(n1+" ");
            }

            System.out.println();
            n1=n1-1;
        }
    }
}
