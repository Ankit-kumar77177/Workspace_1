import java.util.Scanner;
public class AffineChiper {

	
			//Key values of a and b (relative primes)
			    static int a = 7;
			    static int b = 2;

			//Encryption (a * PlainText + b) % m    
			    public static String encrypt(String plaintext) {
			    	
			    	char[] msg = plaintext.toCharArray();
			    	 
			    	
			        String cipher = "";
			        for (int i = 0; i < msg.length; i++) {
			        	
			            if (msg[i] != ' ') {
			                cipher = cipher + (char) ((((a * (msg[i] - 'A')) + b) % 26) + 'A');
			            }
			            
			            else {
			                cipher += msg[i];
			            }
			        }
			       
			        return cipher;
			    }

			//Decryption (inv * (CipherText - b + m)) % m
			    public static String decrypt(String ciphertext) {
			        
			    	String msg = "";
			    	
			    	//Finding the inverse of "a"
			        int inv = 0;
			        int flag = 0;
			        
			        for (int i = 0; i < 26; i++) {
			        	
			            flag = (a * i) % 26;
			            
			            if (flag == 1) {
			                inv = i;
			            }
			        }
			        
			        for (int i = 0; i < ciphertext.length(); i++) {
			        	
			            if (ciphertext.charAt(i) != ' ') {
			                msg = msg + (char) (((inv * ((ciphertext.charAt(i) + 'A' - b)) % 26)) + 'A');
			            }
			            
			            else {
			                msg += ciphertext.charAt(i);
			            }
			        }
			       
			        msg=msg.toLowerCase();
			        return msg;
			    }

			//Main method   
			    public static void main(String[] args) {
			    	
			    	Scanner input = new Scanner(System.in);
			    	System.out.print("Enter the message: ");
			        String msg = input.nextLine();
			       
			        msg = msg.toUpperCase();
			       
			        
			        String ciphertext = encrypt(msg);
			      
			        
			        System.out.println("Encrypted Message is : " + ciphertext);
			        System.out.println("Decrypted Message is: " + decrypt(ciphertext));
	
	        }

}
