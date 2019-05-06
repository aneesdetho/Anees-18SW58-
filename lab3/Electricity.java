import java.util.*;
class Electricity
{ 
public static void main(String [] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter your units");
int unit=s.nextInt();
int a=0;
int b=0;
int c=0;
int d=0;
int sum=0;
for(int i=1;i<=unit;i++)
{
if(i<=50)
{
a++;
}
if(i>50 && i<=100)
{
b++;
}
if(i>100 && i<=150)
{
c++;
}
if(i>150 && i<=200)
{
d++;
}
}
a*=10;
b*=15;
c*=20;
d*=25;
sum=a+b+c+d;
System.out.println(sum);
}
}