import java.util.Scanner;
public class smallest {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        if(a<b && a<c){
            System.out.println("a is small");
        }
//        else if(a<c){
//            System.out.println("a is small");
//        }
        else if(b<a && b<c){
            System.out.println("b is small");
        }
//        else if(b<c){
//            System.out.println("b is small");
//        }
        else if(c<a && c<b){
            System.out.println("c is small");
        }
//        else if(c<b){
//            System.out.println("c is small");
//        }
    }
}
