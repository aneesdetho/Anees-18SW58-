import java.util.*;
class Numberr
{
public static void main(String arr[])
{
Scanner s=new Scanner(System.in);
int sum=0;
System.out.println("Enter the integer number");
int a=s.nextInt();
System.out.println("Enter the last Integer number");
int b=s.nextInt();
for(int i=a;i<=b;i++)
{
sum+=i;
}
System.out.println("Sum of integer="+sum);
}
}
