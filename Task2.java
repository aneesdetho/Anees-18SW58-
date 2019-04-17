class Task2
{
public static void main(String [] args)
{
	
int a=4;
int b=6;
boolean c=a<=b; //Relational operator start
System.out.println(a+"<="+b+"="+c);
c=a>=b;
System.out.println(a+">="+b+"="+c);
c=a==b;
System.out.println(a+"=="+b+"="+c);
c=a<b;
System.out.println(a+"<"+b+"="+c);
c=a>b;
System.out.println(a+">"+b+"="+c);
c=a!=b;
System.out.println(a+"!="+b+"="+c);
// Relational operator ended
System.out.println("Logical operetor");
c=(a<b) || (a!=b);
System.out.println("("+a+"<"+b+" OR "+a+"!="+b+")="+c);
c=(a>b) && (a!=b);
System.out.println("("+a+">"+b+"  And "+a+"!="+b+")="+c);
}
}