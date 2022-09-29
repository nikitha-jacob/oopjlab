import java.util.*;
public class freq
{
    public static void main(String args[])
    {
        int ctr=0,n;
        char c,ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        n=str.length();
        System.out.print("Enter a character: ");
        ch=sc.nextLine().charAt(0);
        for (int i=0;i<n;i++)
        {
            c=str.charAt(i);
            if (c==ch)
            {
                ctr+=1;
            }
        }
        System.out.println(ch+" occurs "+ctr+" times");
    }
}
