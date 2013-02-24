package week１;

/*Implement a method to perform basic string compression using the counts of repeated characters. 
 * For example, the string aabcccccaaa would become a2b1c5a3. 
 * If the "compressed" string would not become smaller than the original string, 
 * your method should return the original string.
 */

public class CompressString {
	  public static String compressString(String str){
		 String output="";
		 char[] strArray=str.toCharArray();
		 int startIndex = 0,endIndex=0;
		 /* while(endIndex <=strArray.length){
             if(endIndex==strArray.length||strArray[startIndex]!=strArray[endIndex]){
            	 int tempLen=endIndex-startIndex;
            	 output=output.concat(""+strArray[startIndex]+tempLen);
            	 startIndex=endIndex;
            	 if(endIndex==strArray.length)
            		 break;
              }else{
            	 endIndex++; 
             }
		 }
		 想了一下，for 循环在结尾部分的处理应该比while要好看*/
		 /*while 循环略丑代码...*/
		 
		 for(endIndex=0;endIndex<strArray.length;endIndex++){
			 if(strArray[startIndex]!=strArray[endIndex]){
				 int tempLen=endIndex-startIndex;
            	 output=output.concat(""+strArray[startIndex]+tempLen);
            	 startIndex=endIndex; 
			 }
		 }
		
		 /*Final group is not easy to be merged
		  * calculate it separately.*/
		 int tempLen=endIndex-startIndex;
    	 output=output.concat(""+strArray[startIndex]+tempLen);
		 
		 if(output.length()>str.length())
			 return str;
		 
         return output; 
      }
	  
	  public static void main(String args[]){
		  System.out.println(compressString("abcdeffffffffeeeeeettttteeeee"));
		  
	  }
	  
}

