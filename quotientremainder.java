import java.util.*;
public class qnr
{
    public static void main(String args[])
    {
        int num1,num2,q,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to divide: ");
        num1=sc.nextInt();
        System.out.println("Enter number to divide by: ");
        num2=sc.nextInt();
        q=num1/num2;
        r=num1%num2;
        System.out.println("Quotient: "+q);
        System.out.println("Remainder: "+r);
    }
}
