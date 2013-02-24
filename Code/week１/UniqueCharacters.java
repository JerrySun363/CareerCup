package week１;
import java.util.Arrays;
import java.util.HashSet;

/*Problem 1.1
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you cannot use additional data structures?
 */
public class UniqueCharacters {
     public boolean isUnique(String s){
    	/*Declare a new HashSet*/
    	HashSet<Character> hs = new HashSet<Character>(); 
        int strLen=s.length();
        for(int i=0;i<strLen;i++){
        	/*Use Java's Hash set to judge whether there is repeating*/
        	if(! hs.add(s.charAt(i))){
        		
        		return false;
        	}
        }
    	 
    	 return true;
     } 
     
     public boolean isUnique2(String s){
    	 /*Firstly sort, then compare
    	  * The string is converted to Array. Not sure whether it satisfies that "No additional data structures"
    	  */
    	 char[] chars=s.toCharArray();
    	 Arrays.sort(chars, 0, chars.length);
    	 for(int i=0;i<chars.length-1;i++){
    		 if(chars[i]==chars[i+1])
    			return false; 
    	 }
    	 return true;
    	 
     }
     
     
}
