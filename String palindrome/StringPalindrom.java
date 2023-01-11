class StringPalindrom{		
	static boolean fun(String s){
		int i=0,e=s.length()-1;
		while(i<e){
			if(s.charAt(i)!=s.charAt(e)){ return false;}
			i++; e--;
		}
		return true;
	}
	public static void main(String args[]){
		String s = "jahaja";
		System.out.println(fun(s));
	}
}