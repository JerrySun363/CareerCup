package week1;


/*
Write a method to replace all spaces in a string with '%20'. 
You may assume that the string has sufficient space at the end of the string to hold the additional characters, and that you are given the "true" length of the string. 
(Note: if implementing in Java, please use a character array so you can perform this operation in place.)

EXAMPLE
Input  : "Mr John Smith"
Output: "Mr%20John%20Smith"*/
public class ReplaceString {
     /*General idea:
      * Count the number of space in the string by going through it
      * calculate the position where the character would be after the replacement*/
	 public static char[] replaceSpace(char[] str, int length){
		 int countSpace=0;
		 for(int i=0;i<length;i++){
			 if (str[i]==' ') 
				 countSpace++;
	     }
		 /*Replace the char from backwards so that the operation does not require extra space*/
		 /*int finalLength = length + countSpace*2; */
		 
		 for(int i=length;i>=0&&countSpace>0;i--){
			 str[i+countSpace *2]=str[i];
			 if(str[i]==' '){
				 str[i+countSpace*2]='0';
				 str[i+countSpace*2-1]='2';
				 str[i+countSpace*2-2]='%';
				 countSpace--;		 
			 } 
		 }
		 
		 return str;
	 }
	 
	 /*Test to run*/
	 public static void main(String args[]){
		/*This is a bad test for it is difficult to construct a char array longer than the string needs  */
		 char[] content="I just want to have a testtesttest==========".toCharArray();
		 System.out.println(replaceSpace(content,20));
	 }
	 
	 
}
