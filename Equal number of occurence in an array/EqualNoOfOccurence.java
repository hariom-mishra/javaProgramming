import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
class EqualNoOfOccurence{
	static boolean fun(int[] ar){
		HashMap<Integer,Integer> num = new HashMap<Integer, Integer>();
		int i;
		for(i =0; i<ar.length;i++){
			num.put(ar[i], num.getOrDefault(ar[i],0)+1);
		}
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(Integer val:num.values()){
			arr.add(val);
		}
		Collections.sort(arr);
		for(i=0;i<arr.size()-1;i++){
			if(arr.get(i)==arr.get(i+1)){
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		int[] ar={1,5,3,5,3,3,4,4,4,4};
		System.out.println(fun(ar));
	}
}