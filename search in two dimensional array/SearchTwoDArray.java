import java.util.Arrays;
class SearchTwoDArray{		
	static int[] fun(int[][] arr, int key){
		int row =0;
		int col =2;
		int[] a= {-1,-1};
		while(row!=2 && col!=0){
			if(arr[row][col]==key){  
				a[0] = row;
				a[1]= col;
				return a; 
			}
			if(arr[row][col]>key){ col--;}
			if(arr[row][col]<key){row++;}
		}
		return a;
	}
	public static void main(String args[]){
		int[][] arr = {{1,2,3},
						{2,4,6},
						{4,5,7}};
		
		System.out.println(Arrays.toString(fun(arr,6)));
	}
}