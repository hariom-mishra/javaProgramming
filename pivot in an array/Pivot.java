class Pivot{
	static int getPivot(int[] ar){
		int s = 0;
		int en =ar.length-1,mid,res=103;
		while(s<en){
			mid = (s+en)/2;
			if(ar[mid]>ar[0])
				s=mid+1;
			else if(ar[mid]<ar[0])
				en=mid;
			if(s==en)
				res= s;
		}
		return res;
	}
	static int fun(int[] ar,int key, int piv){
		int s,en,mid,res=123;
		if(key>ar[0]){
			s=0;
			en =piv;
		}else{
			s=piv;
			en=ar.length-1;
		}
		while(s<en){
			mid = (s+en)/2;
			if(key>ar[mid])
				s=mid+1;

			else if(key<=ar[mid])
				en = mid;
			
			if(s == en)
				res = s;
		}
		return res;
	}
	public static void main(String args[]){
		int[] ar = {7,8,1,3,5};
		int piv = getPivot(ar);
		System.out.print(fun(ar,3,piv));
	}
}