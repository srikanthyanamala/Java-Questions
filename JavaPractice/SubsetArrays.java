package P1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetArrays {

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		subsetsHelper(list, new ArrayList<>(), nums, 0);
		return list;
	}

	private void subsetsHelper(List<List<Integer>> list, List<Integer> resultList, int[] nums, int start) {

		list.add(new ArrayList<>(resultList));
		System.out.println(list);
		for (int i = start; i < nums.length; i++) {
			// add element
			resultList.add(nums[i]);
			// Explore
			subsetsHelper(list, resultList, nums, i + 1);
			// remove
			System.out.println("i :"+i);
			resultList.remove(resultList.size() - 1);
			// resultList = new ArrayList<Integer>();
		}
	}
	
	/*public static <T> void printCombinations(T[] arr) {
	    for(long i = 0, max = 1L << arr.length; i < max; i++) {
	        Set<Integer> ts = new HashSet<Integer>();
	        for(int j = 0; j < arr.length; j++) {
	            if ((i >> j) != 0)
	                ts.add(list.get(j));
	        }
	        System.out.println(ts);
	    }
	}*/

	public static ArrayList<ArrayList<Integer>> subsets1(int[] S) {
		if (S == null)
			return null;

		//Arrays.sort(S);
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < S.length; i++) {
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
			
			// get sets that are already in result
			for (ArrayList<Integer> a : result) {
				temp.add(new ArrayList<Integer>(a));
				//temp.add(a);
			}

			// add S[i] to existing sets
			for (ArrayList<Integer> a : temp) {
				a.add(S[i]);
			}

			// add S[i] only as a set
			ArrayList<Integer> single = new ArrayList<Integer>();
			single.add(S[i]);
			temp.add(single);

			result.addAll(temp);
		}

		// add empty set
		//result.add(new ArrayList<Integer>());
		
		return result;
	}

	public static void main(String[] args) {
		
		int[] nums = { 1, 2, 3 };
		
		System.out.println(subsets1(nums));
		
      /*  int num1 = 9;
        boolean flag = false;
        for(int i = 2; i <= num1/2; i++)
        {
            // condition for nonprime number
            if(num1 % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num1 + " is a prime number.");
        else
            System.out.println(num1 + " is not a prime number.");*/
        
        
        

		SubsetArrays soa = new SubsetArrays();
		
		   /* int size = nums.length;
		    int binaryLimit = (1 << size) - 1;

		    for (int i = 1; i <= binaryLimit; i++) {
		        int index = size - 1;
		        int num = i;
		        while (num > 0) {
		            if ((num & 1) == 1) {
		                System.out.print(nums[index]);
		            }
		            index--;
		            num >>= 1;
		        }
		        System.out.println();
		    }*/
		
		/*List<ArrayList<Integer>> subsets = soa.subsets1(nums);
		System.out.println(subsets.size());

		for (List<Integer> subset : subsets) {
			System.out.println(subset);
		}*/
		List<List<Integer>> subsets1 = soa.subsets(nums);
		
		System.out.println(subsets1.size());
		for (List<Integer> subset : subsets1) {
			System.out.println(subset);
		}

		
		
		
		List<List<Integer>> list = new ArrayList<>();
		System.out.println();soa.subsetsHelper(list, new ArrayList<>(), nums, 0);

		/*String str = "1212";
		int len = str.length();
		int temp = 0;
		// Total possible subsets for string of size n is n*(n+1)/2
		String arr[] = new String[len * (len + 1) / 2];

		// This loop maintains the starting character
		for (int i = 0; i < len; i++) {
			// This loop adds the next character every iteration for the subset to form and
			// add it to the array
			for (int j = i; j < len; j++) {
				arr[temp] = str.substring(i, j + 1);
				temp++;
			}
		}

		// This loop prints all the subsets formed from the string.
		System.out.println("All subsets for given string are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
	}
}
