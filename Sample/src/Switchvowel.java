import java.util.Scanner;
public class Switchvowel {
	public static void main(String args[]){
	
		Scanner ob=new Scanner(System.in);      //To take the input from user
		System.out.println("Enter any alphabet letter :");
		char letter=ob.next().charAt(0);
		try {  
			if(Character.isAlphabetic(letter)) {
				
				switch(letter) {
				case 'a' : System.out.println("Vowel");  
						    break;
				case 'e' : System.out.println("Vowel");  
				   		    break;
				case 'i' : System.out.println("Vowel");  
				   			break;
				case 'o' : System.out.println("Vowel");  
				   			break;
				case 'u' : System.out.println("Vowel");  
				   			break;
				case 'A' : System.out.println("Vowel");  
							break;
				case 'E' : System.out.println("Vowel");  
							break;
				case 'I' : System.out.println("Vowel");  
							break;
				case 'O' : System.out.println("Vowel");  
				   			break;
				case 'U' : System.out.println("Vowel");  
							break;
			    default  : System.out.println("Consonant")	;
			    			break;
							
				}		
			}
			else {
				System.out.println("Invalid input");
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		

		
		
	}
	
}
