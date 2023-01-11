class LongestPrefix{
	public static String longestCommonPrefix(String[] strs) {

        int i=1,j=0;
        //taking variable to compare elements of the arry
        String comp = strs[0];
        String ans="";
        //loop will be running till i in array and j in range of string and comparator
        	while(i<strs.length && j<strs[i].length() && j<comp.length()){
        		
        		 
        		//compare comparator variable to next element of the array
          		if(comp.charAt(j)==strs[i].charAt(j)){
              		ans=ans+comp.charAt(j);
              		//condition for checking that if it is the last position of the element
              		if(j<strs[i].length()-1){
              			j++;
              		}else{
              			j=0;
              			i++;
              			comp = ans;
              			ans = "";
              		}
          		}else{
           			if(comp.length()>ans.length()){
               	 		comp= ans;
                		ans = "";
                	}
                	j=0;
            		i++;  
          		}  
          	//System.out.println(strs[i]);
          	// if(i!=strs.length)		 
       		// 	if(strs[i]==""){ return "";}
       	}

       	 if(comp!="")
            return comp;
        else
            return "";
    }
	public static void main(String args[]){
		
		String[] s1 = {"abab","aba",""};
		System.out.println(longestCommonPrefix(s1));

		/*String[] s2 = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(s2));*/
		
		
	}
}