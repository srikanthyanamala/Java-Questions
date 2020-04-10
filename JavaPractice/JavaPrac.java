package P1;

import java.util.Arrays;
import java.util.HashMap;

public class JavaPrac {

	// palindrome
	public void isPalindrome(int palind) {
		int temp = palind;
		int rev = 0, n;
		while (temp > 0) {
			n = temp % 10;
			rev = (rev * 10) + n;
			temp = temp / 10;
		}
		if (rev == palind)
			System.out.println("Palindrome");
	}

	// secondLargest in Array
	public void secondLargest(int[] intArray) {

		int first, second;

		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > first) {
				second = first;
				first = intArray[i];
			} else if (intArray[i] > second)
				second = intArray[i];
		}
		System.out.println(first);
		System.out.println(second);
		
	}

	// secondLargest in Array
	public void sortingArray(int[] intArray) {

		int first = 0, second = 0, temp = 0;

		for (int i = 0; i < intArray.length; i++) {
			for (int j = i + 1; j < intArray.length; j++) {

				if (intArray[i] > intArray[j]) {
					temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		Arrays.stream(intArray).forEach(e -> System.out.print(e + " "));
	}
	
	public String sortString(String str1,String str2) {
		String [] strArray = {str1,str2};
		Arrays.sort(strArray);
		return strArray[0];
	}
	
	public void sortingStringArray(String [] str) {
		//Cats hats mats
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		
		/*for (int i = 0; i < str.length; i++) {
			String temp = "";
			if(str[i].length() < temp.length()) {
				str[i] = temp;
			}
			else if(str[i].length() == temp.length()) {
				str[i] = sortString(str[i],temp);
			}
		}*/
		String temp = "";
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].length() > str[j].length()) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		
		Arrays.stream(str).forEach(e -> System.out.println(e));
		
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].length() == str[j].length()) {
					str[i] = sortString(str[i],str[j]);
				}
			}
		}
		
		
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				if(str[i].length() > str[j].length()) {
					str[i] = str[j];
				}
				
				else if(str[i].length() == str[j].length()) {
					str[i] = sortString(str[i],str[j]);
				}
			}
		}
		Arrays.stream(str).forEach(e -> System.out.println(e));
	}
	
	static boolean isSubset(int arr1[], int arr2[], int m, int n) {
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++)
				if (arr2[i] == arr1[j])
					break;

			/*
			 * If the above inner loop was not broken at all then arr2[i] is not present in
			 * arr1[]
			 */
			if (j == m)
				return false;
		}

		/*
		 * If we reach here then all elements of arr2[] are present in arr1[]
		 */
		return true;
	}
	
	public static boolean nearestPalindrome(int num) {
		int x=num,rem = 0,sum = 0;
		while(x > 0) {
			rem = x % 10;
			sum = (sum*10) + rem;
			x = x /10;
		}
		return num == sum;
	}
	
	public static void main(String[] args) {
		
		int num = 123 , i = 1;
		
		while(i>0) {
			if(nearestPalindrome(num + i)) {
				System.out.println("nrearest palindrome : "+ (num +i));
				break;
			}
			
			if(nearestPalindrome(num - i)) {
				System.out.println("nrearest palindrome : "+ (num -i));
				break;
			}
			i++;
		}
		
		
		JavaPrac jp = new JavaPrac();
		jp.isPalindrome(121);
		int[] arr = { 1, 2, 5, 4 };
		int[] arrySort = { 6, 2, 5, 4, 8, 10, 1, 1 };
		jp.secondLargest(arr);
		jp.sortingArray(arrySort);
		String str [] = {"cats","hats","mats","ajinxk","ant"};
		jp.sortingStringArray(str);
		
		int n = 7; 
        int m = 4; 
  
        int A[] = { 2, 3, 0, 5, 1, 1, 2 }; 
        int B[] = { 2,2 };
        
        boolean flag = isSubset(A, B, A.length, B.length);
        System.out.println(flag);
        
	}
}
