import java.util.*;
public class assg {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number a:");
        a=sc.nextInt();
        System.out.println("Enter number b:");
        b=sc.nextInt();
        System.out.println("Enter number c:");
        c=sc.nextInt();
        if(a>b&&b>c){
            System.out.println("a is the largest number among these");
        }
        else if(b>c&&b>a){
            System.out.println("b is greatest number among these");
        }
        else{
            System.out.println("c is greatest number among these");
        }
    }
}
