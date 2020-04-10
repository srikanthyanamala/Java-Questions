package P1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class Test1 {
	
	// Utility function to print the sub-array arr[i,j]
		public static void print(int[] arr, int i, int j)
		{
			/*System.out.println(IntStream.range(i, j + 1)
										.mapToObj(k -> arr[k])
										.collect(Collectors.toList()));*/
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int k = i; k <=j; k++) {
				list.add(arr[k]);	
			}
			System.out.println(list);
		}

		// Function to find sub-arrays with given sum in an array
		public static void findSubarrays(int[] arr, int sum)
		{
			for (int i = 0; i < arr.length; i++)
			{
				int sum_so_far = 0;

				// consider all sub-arrays starting from i and ending at j
				for (int j = i; j < arr.length; j++)
				{
					// sum of elements so far
					sum_so_far += arr[j];

					// if sum so far is equal to the given sum
					if (sum_so_far == sum) {
						print(arr, i, j);
					}
				}
			}
		}
		
		 public void printSubArrays(int [] arrA){   

		        int arrSize = arrA.length;
		        List<ArrayList<Integer>> mList = new ArrayList<ArrayList<Integer>>();
		        //start point
		        /*for (int startPoint = 0; startPoint <arrSize ; startPoint++) {
		            //group sizes
		            for (int grps = startPoint; grps <=arrSize ; grps++) {
		                //if start point = 1 then
		                //grp size = 1 , print 1
		                //grp size = 2, print 1 2
		                //grp size = 3, print 1 2 3 ans so on
		            	ArrayList<Integer> list = new ArrayList<Integer>();
		                for (int j = startPoint ; j < grps ; j++) {
		                    //System.out.print(arrA[j] + " ");
		                    list.add(arrA[j]);
		                    
		                }
		                mList.add(list);
		                //System.out.println();
		            }
		        }*/
		        
		        for (int i = 0; i <arrSize ; i++) {
		            //group sizes
		            for (int j = i; j <=arrSize ; j++) {
		                //if start point = 1 then
		                //grp size = 1 , print 1
		                //grp size = 2, print 1 2
		                //grp size = 3, print 1 2 3 ans so on
		            	ArrayList<Integer> list = new ArrayList<Integer>();
		                for (int k = i ; k < j ; k++) {
		                    //System.out.print(arrA[j] + " ");
		                    list.add(arrA[k]);
		                    
		                }
		                mList.add(list);
		                //System.out.println();
		            }
		        }
		        
		        
		        
		        
		        
		        System.out.println(mList);
		    }
		 
		 public static long nearestPalindromic1(String n) {
		        long num = Long.parseLong(n);
		        long temp = 0;
		        for (long i = 1;i<num; i++) {
		            if (isPalindrome(num - i))
		            	temp =num - i;
		                //return "" + (num - i);
		            if (isPalindrome(num + i))
		            	temp =num + i;
		                //return "" + (num + i);
		        }
				
		        return temp;
		    }
		 
		 static boolean isPalindrome(long x) {
		        long t = x, rev = 0;
		        while (t > 0) {
		            rev = 10 * rev + t % 10;
		            t /= 10;
		        }
		        return rev == x;
		    }
		public static void main(String[] args)
		{
			//int[] arr = { 3, 4, -7, 1, 3, 3, 1, -4 };
			int[] arr = { 1,2,2,3,5 };
			int sum = 7;
			
			//rsultArray();

			//findSubarrays(arr, sum);
			
			int [] arrA = {1,2,3, 4};
	        new Test1().printSubArrays(arrA);
	        
	        char[] ch= ("Test").toCharArray();
	        
	        String s1 = new String(ch);
	        String s2 = new String(ch);
	        
	        System.out.println(s1.equals(s2));
	        
	        
		}
		
		
		public static int[] rsultArray() {
			
			int [] array  = {1,2,3,4};
			int [] e1  = {1,2};
			
			ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
			
			for (int i = 0; i < array.length; i++) {
				
				for (int j = i; j <=array.length; j++) {
					
					int num []= {};
					
					for (int k = i; k < j; k++) {
						num[k] = array[k];
					}
					
					Arrays.stream(num) 
			        .forEach(e->System.out.print(e + " ")); 
					if(e1.equals(num))
						System.out.println("Pass");
					
				}
			}
					
			return null;
		}
		
		
		
		
		
		
}
