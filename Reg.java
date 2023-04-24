 import java.util.Scanner;

/**
 *
 * @author 
 */
public class Reg {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {

		// declare
		String Username;
		String Password;
		String FirstName;
		String LastName;
		String newUsername = null;
                String newPassword = null;
        
	Scanner inputuser = new Scanner(System.in); // scanner, user input
		System.out.println("Enter your First Name:");// tells user what to input
		FirstName = inputuser.nextLine();// allows user input

		System.out.println("Enter your Last Name:");// tells user what to input
		LastName = inputuser.nextLine();// allows user input
		
		System.out.println("Enter your Username:");// tells user what to input
		Username = inputuser.nextLine();// allows user input
	         if (Username.contains("_") && Username.length() <= 5) {
			System.out.println("Username Successfully Captured");
		} 
                else{
		while((!Username.equals(Username.concat("_"))) || Username.length()>5){
		System.out.println("Username is not correctly formatted, please ensure that your username contians an underscore(\'_\') and is no more than 5 characters in length."
					+ "\nRe-enter username: ");
			newUsername = inputuser.nextLine();
			if (newUsername.contains("_") && newUsername.length() <= 5) {
				System.out.println("Username Successfully Captured");
				break;
			}		
			}
    
                }
                
        System.out.println("Enter Password");
        Password = inputuser.nextLine();

		if (PasswordToContain(Password)==true && Password.length()>8) {//if Password meets all requirements, positve output
			System.out.println("Password Successfully Captured");
		}
		
		else if(PasswordToContain(Password)==false && Password.length()<8){//if Password doesn't meet requirements, returns false, untill all requirements are met.
			while(PasswordToContain(Password)==false && Password.length()<8) {
				System.out.println("Password is not correctly formatted please ensure that the password contains atleast 8 characters, a capital letter, a number and a special character(!@#$&+=%,)."
                                        + "\nRe-enter Password ");// error message that'll display on console, also telling the user what are the requirements for the password/
				 newPassword= inputuser.nextLine();
				if (PasswordToContain(newPassword)==true && Password.length()>8) {
					System.out.println("Password Successfully Captured");
                                        break;
				}
			}
                }
		// NUMBER2 Login
		System.out.println("\nPlease Enter Login Info");

		System.out.println("Enter Username:");
		String username = inputuser.nextLine();

                if (username.equals(Username) || username.equals(newUsername)) {
			System.out.println("Username entered is a match");
                }
                else if( username != Username ||  username != newUsername){
                    while( username != Username ||  username != newUsername){
                        System.out.println("Username entered not a match"
                                + "\nRe-Enter Username:");
                          username = inputuser.nextLine();
                         if (username.equals(Username) || username.equals(newUsername)) {
			System.out.println("Username entered is a match.");
                        break;
                         }
                    }
                }  
		 System.out.println("Enter Password:");
		 String password = inputuser.nextLine();
		if ( password.equals(newPassword) || password.equals(Password)) {
			System.out.println("Password entered is a match"
                                + "\nWelcome " + FirstName + " " + LastName + ", it is great to see you again.");
		}
                else if(password !=newPassword ||  Password != password){
                    while( password !=newPassword ||  Password != password){
                        System.out.println("Password not a match!,\nRe-Enter Password:");
                          password= inputuser.nextLine();
                         if (password.equals(newPassword) || password.equals(Password)) {
			System.out.println("Password entered found\n"
                                + "Welcome " + FirstName + " " + LastName + ", it is great to see you again.");
                        break;
                         } 	
                         }
                    }
                }
   //class to check PasswordComplexity(), to check if all requirements are met. 
	public static boolean PasswordToContain(String Password) {
		boolean number= false;// number 0-9
		boolean CapLetters= false;//CapitalLetter [A-Z}
		boolean LowLetters = false;// Lower Case Letter [a-z]
		boolean SpeCharacter = false;//Special characters[!@#$&+=%,] 
		char E;//Declaration that variable a is a char
		
		for(int i= 0;i<Password.length();i++) {
			E=Password.charAt(i);
			if (Character.isDigit(E)) {
				number=true;
			}
			 if (Character.isUpperCase(E)) {
				CapLetters=true;
			}
			 if (Character.isLowerCase(E)) {
				LowLetters = true;
			}
			 if ('!'==E || '@'==E||'#'==E || '$'==E || '&'==E||'?'==E||'/'==E || '+'==E || '%'==E||'='==E||',' ==E) {
				SpeCharacter=true;
				
				
			}
			if (number && CapLetters && LowLetters && SpeCharacter) {
					return true;
		}
		}
	
	return false;

	}
	
}
