package wipro;

public class String_Class {

	public static void main(String[] args) {
		    String str = " Hello Venkat  ";
	        String str2 = "hello ram";
	        String str3 = "Reddy";
	        

	        System.out.println("Length: " + str.length());
	        
	        System.out.println("Char at 1:" + str.charAt(1));
	        
	        System.out.println("Substring from 2:" + str.substring(2));
	        
	        System.out.println("Substring from 2 to 8:" + str.substring(2, 8));
	        
	        System.out.println("Concat: " + str3.concat(" ram"));

	        System.out.println("Equals: " + str.trim().equals(str2));

	        System.out.println("IndexOf 'o': " + str.indexOf('o'));
	       
	        System.out.println("LastIndexOf 'l': " + str.lastIndexOf("l"));
	        
	        System.out.println("Contains 'Hello': " + str.contains("Hello"));
	        
	        System.out.println("StartsWith '  He': " + str.startsWith("  He"));
	        
	        System.out.println("EndsWith '  ': " + str.endsWith("  "));
	   
	        System.out.println("To Lower: " + str.toLowerCase());
	        
	        System.out.println("To Upper: " + str.toUpperCase());

	        System.out.println("Trimmed: " + str.trim());
	        
	        System.out.println("Replace 'l' with 'x': " + str.replace('l', 'x'));
	        
	        System.out.println("ReplaceAll vowels with '*': " + str.replaceAll("[aeiouAEIOU]", "*"));
	       
	        System.out.println("ReplaceFirst vowel with '*': " + str.replaceFirst("[aeiouAEIOU]", "*"));

	}

}
