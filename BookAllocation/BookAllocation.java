class BookAllocation{
	static boolean isPossible(int[] ar, int key,int mid){
		int countStudent = 1;
		int pageSum =0;

		for(int i=0;i<ar.length;i++){
			if(pageSum+ar[i]<=mid)
				pageSum+=ar[i];
			else{
				countStudent++;
				if(countStudent>key || ar[i]>mid)
					return false;
				pageSum = ar[i];
			}
			
		}
		return true;
	}
	static int fun(int[] ar, int key){
		int sum=0,mid, start=0;
		int ans =-1;
		for(int i =0 ;i<ar.length;i++){
			sum = sum+ar[i];
		}
		int end = sum;
		while(start<=end){
			mid = start + (end-start)/2;
			if(isPossible(ar,key, mid)){
				ans = mid;
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		return ans;
	}
	public static void main(String args[]){
		int[] ar = {30,10,20,40};
		System.out.println(fun(ar, 2));
	}
}