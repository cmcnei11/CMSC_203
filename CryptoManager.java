package decode;

public class CryptoManager {
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds(String plainText) {
		//throw new RuntimeException("method not implemented");
		int value1 = LOWER_BOUND;
		int value2 = UPPER_BOUND;
		int value3;
		for(int i = 0; i < plainText.length(); i++) {
			value3 = plainText.charAt(i);
			if(!(value3 >= value1 && value3 <= value2 ) )
				return false;
		}
		return true;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {
		//throw new RuntimeException("method not implemented");
		String newString ="";
	
		for(int j = 0; j < plainText.length();j++) {
			int x = (int)plainText.charAt(j) + key;
		newString += (char)x;
		}
		
		return newString;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {
	

		int ascii;
		int newAscii;
		int finalAscii;
		int j =0;
		String str = " ";
		for(int i = 0; i < plainText.length();i++) {
	
			
				if(j < bellasoStr.length()) {
				ascii = plainText.charAt(i);
				newAscii = bellasoStr.charAt(j);
				finalAscii = newAscii +ascii;
				if(finalAscii > 95) finalAscii -= 64;
				str += (char)finalAscii;
				j++;
				}
				else {
						j=0;
						ascii = plainText.charAt(i);
						newAscii = bellasoStr.charAt(j);
						finalAscii = newAscii +ascii;
						if(finalAscii > 95) finalAscii -= 64;
						str += (char)finalAscii;
						j++;
				}
				
			}
		return str;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedText, int key) {
		//throw new RuntimeException("method not implemented");
		String newString ="";
		
		for(int j = 0; j < encryptedText.length();j++) {
			int x = (int)encryptedText.charAt(j) - key;
		newString += (char)x;
		}

		return newString;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		//throw new RuntimeException("method not implemented");
		
		int ascii;
		int newAscii;
		int finalAscii;
		int j =0;
		String str = " ";
		for(int i = 0; i < encryptedText.length();i++) {
	
			
				if(j < bellasoStr.length()) {
				ascii = encryptedText.charAt(i);
				newAscii = bellasoStr.charAt(j);
				finalAscii =  ascii - newAscii;
				
				if(finalAscii != 32) {
					while(finalAscii <65) finalAscii += 64;
					str += (char)finalAscii;
					j++;
					}
					else {
						str += " ";
						j++;
					}
				
				
				}
				else {
						j=0;
						ascii = encryptedText.charAt(i);
						newAscii = bellasoStr.charAt(j);
						finalAscii = ascii - newAscii;
						
						if(finalAscii != 32) {
						while(finalAscii <65) finalAscii += 64;
						str += (char)finalAscii;
						j++;
						}
						else {
							str += " "
									;
							j++;
						}
							
						
						
				}
				
			}
		return str;
	}
}
