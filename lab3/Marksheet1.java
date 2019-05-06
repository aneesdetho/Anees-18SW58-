import java.util.*;
class Marksheet1
{
public static void main(String [] arg)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your name");
String a=s.next();
System.out.println("E	`	nter your Department");
String b=s.next();
System.out.println("Enter your Roll number");
int c=s.nextInt();
System.out.println("Enter your C++ Marks");
int d=s.nextInt();
System.out.println("Enter the Data Structure marks");
int m=s.nextInt();
System.out.println("Enter your Operating System Marks");
int f=s.nextInt();
int obtainmarks=d+m+f;
int totalmarks=300;
String grade="Fail";
float per=obtainmarks*100/totalmarks;

if(per>90)
{
grade="A";
}
else if(per>80 && per==90)
{
grade="B";
}
else if(per>70 && per==79)
{
grade="C";
}
else if(per>60 && per==69)
{
grade="D";
}
else if(per<=60)
{
grade="Fail";
}
System.out.println("Name="+a+"\ndepartment="+b+"\nRoll no:="+c);
System.out.println("English Marks="+d+"\nMaths Marks="+m+"\nPhysics="+f);
System.out.println("Obtain Marks="+obtainmarks+"\nTotal Marks="+totalmarks);
System.out.println("Percentage="+per);
System.out.println("Grade="+grade);
}
}