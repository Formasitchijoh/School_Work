
//This program illustrate the caeser Cipher Technique
public class Caeser_cipher {
	
	//method use to encrypt a text using a shift of s
	
	public static StringBuffer encrypt(String text, int s) {
		StringBuffer result = new StringBuffer();
		
		for(int i = 0; i <text.length(); i++) {
			
			if (Character.isUpperCase(text.charAt(i)))
			{
				char ch = (char)(((int)text.charAt(i) + s - 65)% 26 + 65);
				result.append(ch);
			}
			
			else {
				char ch = (char)(((int)text.charAt(i) + s - 97)%26 +97);
				result.append(ch);
			}
		}
		
		return result;
	}
	
	//Method used to decrypt a message using the key d
	
	public static StringBuffer decrypt(String text, int d) {
		
		StringBuffer results = new StringBuffer();
		
		for(int i = 0; i < text.length(); i++) {
			
			if(Character.isUpperCase(text.charAt(i)))
			{
				char ch = (char)(((int)text.charAt(i) - d - 65)%26  + 65);
				results.append(ch);
			}
			
			else {
				char ch = (char)(((int)text.charAt(i) - d - 97)%26 + 97);
				results.append(ch);
			}
		}
		return results;
	}
	
	public static void main(String[] args) {
		
		String text = "attonment";
		int s = 4;
		int d = 25;
		//Using the toString() function of the StringBuffer function to convert 
		//the StringBuffer to String
		String res = (encrypt(text,s).toString());
		System.out.println("Text :" + text);
		System.out.println("shift :" + s);
		System.out.println("Cipher :" + encrypt(text,s));
		System.out.println("Decipher :" + decrypt(res, 4));
		
	}
}
