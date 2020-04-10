package P1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Demo {
	
	static final int count =1;
	
	public void method() {}
	
	// Function to print all the permutations of str
	static void printPermutn(String str, String ans) {

		// If string is empty
		if (str.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			// ith character of str
			char ch = str.charAt(i);

			// Rest of the string after excluding
			// the ith character
			String s1 = str.substring(0, i);
			String s2 = str.substring(i + 1);
			
			String ros = s1 +s2;

			// Recurvise call
			printPermutn(ros, ans + ch);
		}
	}

	public static void main(String[] args) {

		String s = "abb"; 
        printPermutn(s, ""); 
        
        if(Character.isLowerCase(s.charAt(0))){
			//lowercase++;
		}
		else if(Character.isUpperCase(s.charAt(0))){
			//uppercase++;
		}
        
//		/*
//		 * int arr[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 }; Arrays.sort(arr); //
//		 * System.out.println(Arrays.toString(arr)); System.out.println(arr[arr.length -
//		 * 1]);
//		 * 	
//		 * int firstLargest = arr[0]; int secondLargest = arr[0];
//		 * 
//		 * for (int i = 0; i < arr.length; i++) {
//		 * 
//		 * if (firstLargest > arr[i]) { secondLargest = firstLargest; firstLargest =
//		 * arr[i]; } else if (arr[i] > secondLargest) secondLargest = arr[i];
//		 * 
//		 * }
//		 * 
//		 * System.out.println(secondLargest);
//		 */

		// Write code here
		
		
		 int r,sum=0,temp1;    
		  int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp1=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp1==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    

		int[] arr = { 3, 4, 8, 5, 6,1};
		int first = 0 ,second = 0 , temp=0;
		
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}
		
		Arrays.stream(arr) 
        .forEach(e->System.out.print(e + " ")); 
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>first) {
				second = first;
				first = arr[i];
			}
			else if(arr[i] > second) {
				second = arr[i];
				
			}
		}
		
		
		
		
		System.out.println(second);

		Arrays.sort(arr);


	}
}
