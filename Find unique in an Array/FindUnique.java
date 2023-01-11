class FindUnique{
	static int fun(int[] ar){
		int i =0,ans=0;
		while(i<ar.length){
			ans = ans^ar[i];
			i++;
		}
		return ans;
	}
	public static void main(String args[]){
		int[] ar = {1,2,2,1,3};
		System.out.println(fun(ar));
	}
}