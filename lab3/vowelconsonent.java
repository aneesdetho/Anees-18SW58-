public class vowelconsonent{
	public static void main(String ar[]){
		char a = ar[0].charAt(0);
		switch(a){
			case 'A': case 'E':	case 'I':
			case 'U': case 'O':
			case 'a': case 'i':	case 'e':
			case 'u': case 'o':
				System.out.println("Vowel------ "+a);
				break;
			default:
				System.out.println("Consonent----- "+a);
				break;
		}//end switch
	}//end main
 }