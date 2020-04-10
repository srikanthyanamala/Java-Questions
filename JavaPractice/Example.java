package P1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Example {
	
	
	public static void main(String[] args) {

		// Write code here
		// Write code here
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.next();
		scanner.close();

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

		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("d");
		
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("d");
		
		System.out.println(l1.equals(l2));
		
		String s1 = "hello";
		String s2 = "leloH";
		
		int []  i1 = {1};
		int []  i2 = {1,2};
		
		System.out.println(Arrays.compare(i1, i2));
		
		int count = s1.length() ;
		String temp = "";
		
		String str [] = new String[s1.length()];
		
		for (int i = 0; i < str.length; i++) {
			str[i] = String.valueOf(s1.charAt(i));
		}
		
		for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
		
		System.out.println(str);
		
		char arr1 [] = s1.toCharArray();
		char arr2 [] = s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String ex1 = new String(arr1);
		String ex2 = new String(arr2);
		
		System.out.println(ex2.toLowerCase()==ex1.toLowerCase());
		
		System.out.println(ex1.toLowerCase().equalsIgnoreCase(ex2.toLowerCase()));
	}
}
