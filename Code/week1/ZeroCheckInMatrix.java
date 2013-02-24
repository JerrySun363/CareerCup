package week1;
import java.util.HashSet;

/*Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.*/

public class ZeroCheckInMatrix {
      
	public int[][] zeroSet(int[][] matrix){
		int m = matrix.length;
		int n = matrix[0].length;
		HashSet<Integer> column=new HashSet<Integer>();
		HashSet<Integer> row=new HashSet<Integer>();
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(matrix[i][j]==0){
				  column.add(i);
				  row.add(j);
				}
			}
		}
		 
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(column.contains(i)||row.contains(j)){
					matrix[i][j]=0;
				}
			}
		}
		
		
		return matrix;
	}
}
