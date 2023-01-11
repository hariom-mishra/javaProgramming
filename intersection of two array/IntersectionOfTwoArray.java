class IntersectionOfTwoArray{
	static void fun(int[] ar,int[] ar1){
		int i=0,j=0;
		while(i<ar.length && j<ar1.length){
			if(ar[i]<ar1[j]){i++;}
				if(ar[i]>ar1[j]){j++;}
				if(ar[i]==ar1[j]){
					System.out.println(ar[i]);
					ar1[j]=Integer.MIN_VALUE;
					i++;
				}
		}
	}
	public static void main(String args[]){
		int[] ar = {1,2,2,3};
		int[] ar1 = {2,5};
		fun(ar,ar1);
	}
}