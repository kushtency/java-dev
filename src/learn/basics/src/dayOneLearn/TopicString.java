package dayOneLearn;

/**
 * 
 * strings that are made from String class are immutable in java
 * an altered object of string is created whenever needed.
 * 
 * The string in java are treated as the Object of String class
 * and this can be converted to character sequence or char[]
 * by default anything in double quotes represent a string literal
 * JVM treats this string literal as an object of String class
 * on which every of String class can be applied.
 * 
 * 	"this is string".length()
 * 
 * the above statement is valid and executes successfully
 * 
 * this String object have many methods including :
 * 	1. compare 2 strings
 * 	2. searching substrings
 * 	3. concat 2 strings
 * 	4. change the case of letters and many more...
 * 
 * There are many ways to initialize strings like :
 * 
 * 	String s = new String("hello");
 * 	char[] chars = {'j','a','v','a'};
 * 	s = new String(chars);
 * 	s = new String(chars, 0, 2);
 * 	String str = "hello"; //using string literals
 * 
 * basic Operations on String class : ( str is an object of String class )
 * 
 * 	1. length of the string str.length()
 * 	2. substring from a string str.substring("start","end+1")
 * 	3. adding of 2 string can be done by simply using "+" operator
 * 	4. to change the case of letters "str.toUpperCase()", "str.toLowerCase()"
 * 	5. changing the string to character Array "str.toCharArray()" returns char[]
 * 
 * Operations that are common to strings in languages
 * 
 * 	1. access the character using "str.charAt("index")"
 * 	2. replace all the character and its occurrence in string "str.replace("oldCharacter", "newCharacter")"
 * 	3. comparison between 2 strings "str1.compareTo("str2")", "str1.compareToIgnoreCase("str2")" quest
 * 	4. checking if the string is equal "str1.equalsIgnoreCase("str2")", "str1.equals("str2")" quest
 * 
 */

public class TopicString {

	public static void main(String[] args) {
		
		// initializing the string
		String str = "This is a string";
		
		// read only loop on string
		for(char ch: str.toCharArray()) {
			System.out.println(ch);
		}
		System.out.println();
		
		// read only loop using charAt()
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		// appending string
		str = str + " another string";
		System.out.println(str);
		
		// updating in between
		str = str.substring(0, 7) + "C" + str.substring(7, str.length());
		System.out.println(str);
		
		// changing cases for string
		str = str.toUpperCase();
		System.out.println(str);
		
		// replacing all occurrence of I with '*'
		str = str.replace('I', '*');
		System.out.println(str);

	}

}
