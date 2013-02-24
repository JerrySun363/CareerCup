package ｗeek１;
/*Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes 
 * write a method to rotate the image by 90 degrees. 
 * Can you do this in place?
 */
public class RotateImage {
	/*Since an integer is composed of four bytes, and the pixels' order are not changed in a single pixel
	 * it is reasonable to store in integers
	 *  To be in place, first swap the two rows in the same column, the middle row unchanged
	 *  Then swap the two according to the Diagonal as the axis of symmetry*/
	
	public static int[][] rotateImage(int[][] image){
		int n=image.length;
		/*The first step*/
		for(int i=0;i<n;i++){
			for(int j=0;j<n/2;j++){
			image[i][j]=image[i][j]+image[i][n-j-1];
			image[i][n-j-1]=image[i][j]-image[i][n-j-1];
			image[i][j]=image[i][j]-image[i][n-j-1];
			}
		}
		/*The second step*/
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
			image[i][j]=image[i][j]+image[n-j-1][n-i-1];
			image[n-j-1][n-i-1]=image[i][j]-image[n-j-1][n-i-1];
			image[i][j]=image[i][j]-image[n-j-1][n-i-1];
			}
		}
		
		return image;
	}
	
    /*public static void swap(int a, int b){
    	a=a+b;
    	b=a-b;
    	a=a-b;
      }*/
    
    public static void main(String args[]){
    int[][] image={{1,2,3},{4,5,6},{7,8,9}};
    image=rotateImage(image);
    System.out.println(image[0][0]+" "+image[0][1]+" "+image[0][2]+" \r"+image[1][0]+" "+image[1][1]+" "+image[1][2]+" \r"+image[2][0]+" "+image[2][1]+" "+image[2][2]);
    	
    }
    

}
