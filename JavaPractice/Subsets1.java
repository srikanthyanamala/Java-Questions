package P1;

import java.util.ArrayList;

public class Subsets1 {

	public static ArrayList<ArrayList<Integer>> subsets1(int[] S) {
		if (S == null)
			return null;

		//Arrays.sort(S);
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> result1 = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < S.length; i++) {
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
			ArrayList<ArrayList<Integer>> temp1 = new ArrayList<ArrayList<Integer>>();
			
			// get sets that are already in result
			for (ArrayList<Integer> a : result) {
				//temp.add(new ArrayList<Integer>(a));
				temp.add(a);
			}
			
			/*for (ArrayList<Integer> a : result1) {
				temp1.add(a);
			}*/
			
			// add S[i] to existing sets
			for (ArrayList<Integer> a : temp) {
				a.add(S[i]);
			}
			
			/*for (ArrayList<Integer> a : temp1) {
				a.add(S[i]);
			}*/

			// add S[i] only as a set
			ArrayList<Integer> single = new ArrayList<Integer>();
			single.add(S[i]);
			temp.add(single);
			//temp1.add(single);

			result.addAll(temp);
			//result1.addAll(temp1);
		}

		// add empty set
		//result.add(new ArrayList<Integer>());
		System.out.println(result);
		System.out.println(result1);
		return result;
	}
	
	
	
	static void printSubsets(int set[]) 
    { 
        int n = set.length; 
  
        // Run a loop for printing all 2^n 
        // subsets one by obe 
        for (int i = 0; i < (1<<n); i++) 
        { 
            System.out.print("{ "); 
  
            ArrayList<Integer> all = new ArrayList<Integer>();
            // Print current subset 
            for (int j = 0; j < n; j++) {
  
                // (1<<j) is a number with jth bit 1 
                // so when we 'and' them with the 
                // subset number we get which numbers 
                // are present in the subset and which 
                // are not 
            	
            	System.out.println(1 << j);
            	
                if ((i & (1 << j)) > 0) {
                	all.add(set[j]);
                    //System.out.print(set[j] + " ");
                }
            }
            System.out.println(all);
            //System.out.println("}"); 
        } 
    } 
	
	public static void main(String[] args) {
		
		int set[] = {1,2,3}; 
        printSubsets(set); 
		
		int [] nums = { 1, 2, 3 };
		
		//System.out.println(subsets1(nums));
	}
}
