import java.util.*;
class Vowelconsonant
{
public static void main(String arr[]);
{
Scanner s=new Scanner(System.in);
char ch=arr[0].charAt(0);
int choice=s.nextInt();
Switch(choice);
{
case 'a':
if(ch == 'A' || ch =='E' || ch =='a'){
			System.out.println("Vowel "+ch);
		}
		else{
			System.out.println("Consonent "+ch);
		}
		}
		}