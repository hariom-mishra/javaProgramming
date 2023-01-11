import java.util.HashMap;
import java.util.Map.Entry;
class FindAllDuplicateElimentOfArray{
	static void fun(int[] ar){
		HashMap<Integer,Integer> num = new HashMap<Integer,Integer>();
		for(int i = 0;i<ar.length;i++){
			num.put(ar[i], num.getOrDefault(ar[i],0)+1);
		}
		for(Entry <Integer,Integer> en:num.entrySet()){
			//System.out.println(en.getValue());
			if(en.getValue()==2){System.out.println(en.getKey());}
		}
	}
	public static void main(String args[]){
		int[] ar={1,5,2,4,2};
		fun(ar);
	}
}