package P1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CommonQ {
	
	/* Returns true if the there is a subarray of arr[] with sum equal to 
    'sum' otherwise returns false.  Also, prints the result */
 int subArraySum(int arr[], int n, int sum)  
 { 
     int curr_sum = arr[0], start = 0; 

     // Pick a starting point 
     for (int i = 1; i <= n; i++)  
     { 
         // If curr_sum exceeds the sum, then remove the starting elements 
         while (curr_sum > sum && start < i-1) 
         { 
             curr_sum = curr_sum - arr[start]; 
             start++; 
         } 
           
         // If curr_sum becomes equal to sum, then return true 
         if (curr_sum == sum)  
         { 
             int p = i-1; 
             System.out.println("Sum found between indexes " + start 
                     + " and " + p); 
             return 1; 
         } 
           
         // Add this element to curr_sum 
         if (i < n) 
         curr_sum = curr_sum + arr[i]; 
           
     } 

     System.out.println("No subarray found"); 
     return 0; 
 } 

	public static void main(String[] args) {
		
		String inputString= "()(()))))"; 
		
		int maxans = 0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(-1);
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        System.out.println(maxans);

		/*int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
		
		int largest = arr[0];
		int secLargest = arr[1];
		
		for (int i = 0; i < arr.length; i++) {
			 
			if (arr[i] > largest) {
				secLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secLargest) {
				secLargest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secLargest);*/
		
		//-------------------------------------------------------------------------------
		      /*Integer array[] = {10, 20, 25, 63, 96, 57};
		      int size = array.length;
		      Arrays.sort(array);
		      List<Integer> li = new ArrayList<Integer>(Arrays.asList(array));
		      System.out.println("sorted Array ::"+Arrays.toString(array));
		      int res = array[size-2];
		      System.out.println("2nd largest element is ::"+res);*/
		
		//-------------------------------------------------------------------------------
		
		/*char ch = 'P';
        int asciiCode = ch;
        // type casting char as int
        int asciiValue = (int)ch;

        System.out.println("ASCII value of "+ch+" is: " + asciiCode);
        System.out.println("ASCII value of "+ch+" is: " + asciiValue);*/
		
		
		CommonQ arraysum = new CommonQ(); 
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
        int n = arr.length; 
        int sum = 23; 
        arraysum.subArraySum(arr, n, sum); 
		
		
		
	}

}
