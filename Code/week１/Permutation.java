package week１;
/*1.3
 * Given two strings, write a method to decide if one is a permutation of the other.
 * As my understanding of Permutation, same characters should occur exactly same times. 
 * */
public class Permutation {
   public static boolean isPermutation(String s1, String s2){
	   /*Firstly, compare their length*/
	   if(s1.length()!=s2.length())
		   return false;
	   
	   /*Then use bitmap to do the counting
	    * Assume char has a range of 0 to 255*/
	   int map[] =new int[256];
	   int length=s1.length();
	   for(int i=0;i<length;i++){
		   map[s1.charAt(i)]++;
	   }
	   for(int i=0;i<length;i++){
		   map[s2.charAt(i)]--;
	   }
	   /*Check whether they are all zeros*/
	   for (int i=0;i<256;i++){
		   if(map[i]!=0)
			   return false;
	   }
	   
	   return true;
   } 
	
  public static void main(String args[]){
	 /*Runs the test*/
	  String s1="我们";
	  String s2="们我";
	  /*The above has the issue of ArrayIndexOutOfBoundsException until the array is 65535*/
	  System.out.println(isPermutation(s1,s2));
  } 
}
