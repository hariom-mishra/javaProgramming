class SquareRoot{
	static double fun(int num){
		int en = num,s=0;
		double res=0;
		int mid=0;
		while(s<en){
			mid =(s+en)/2;
			if(s*s<num && (s+1)*(s+1)>num){
				res = s;
				while(res*res<num){
					res = res+0.1;
				}
				return res;
			}
			else if(mid*mid > num){
				en=mid;
			}
			else if(mid*mid<num)
				s=mid;
			else if(mid*mid==num){
				res = (double)(mid);
				break;
			}
				
		}
		return res;
	}
	public static void main(String args[]){
		System.out.println(fun(25));
	}
}