import java.util.*;
public class Student 
{
    public static void main(String args[])
    {
        String name,clas;
        int roll,sem;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER STUDENT DETAILS");
        System.out.print("Name: ");
        name=sc.next();
        System.out.print("Roll number: ");
        roll=sc.nextInt();
        System.out.print("Class: ");
        clas=sc.next();
        System.out.print("Semester: ");
        sem=sc.nextInt();
        System.out.print("Name: "+name+"\tRoll number: "+roll+"\tClass: "+clas+"\tSemester: "+sem);
    }
}
