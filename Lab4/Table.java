import java.util.*;
class Table
{
public static void main(String arr[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the Table");
int t=s.nextInt();
System.out.println("Starting point of table");
int a=s.nextInt();
System.out.println("Enter the ending point of table");
int b=s.nextInt();
for(int i=a;i<=b;i++)
{
	
System.out.println(t+"*"+a+"="+t*a);
a++;
}
}
}
