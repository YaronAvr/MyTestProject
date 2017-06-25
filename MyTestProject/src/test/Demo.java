package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Demo {
	
	
    

    public static void main(String[] args) throws Exception {
       
    	String str1 = "abracadabra";
    	String str2 = "abra" + "cadabra";
    	String str3 = new String("abracadabra");
    	
    	String s = "a";
    	String s1 = "a";
    	
    	System.out.println(str1 == str2);
    	System.out.println(str1 == str3);
    	System.out.println(str2 == str3);
    	System.out.println(str1);
    	System.out.println(str2);
    	System.out.println(s == s1);
    	System.out.println(str3.equals(str1));
    	
    	String str = "jkfzfjkdnvkdjkv";
    	
    	char [] charArr = new char[str.length()];
    	
    	for (int i = 0; i < charArr.length; i++) {
			charArr[i] = str.charAt(str.length()-i - 1);
		}
    	System.out.println(charArr);
    	
    	
        
    }
}