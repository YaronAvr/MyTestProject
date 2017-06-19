package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Demo {
	
	
    

    public static void main(String[] args) throws Exception {
       
    	String str = "jkfzfjkdnvkdjkv";
    	
    	char [] charArr = new char[str.length()];
    	
    	for (int i = 0; i < charArr.length; i++) {
			charArr[i] = str.charAt(str.length()-i - 1);
		}
    	System.out.println(charArr);
    	
    	
        
    }
}