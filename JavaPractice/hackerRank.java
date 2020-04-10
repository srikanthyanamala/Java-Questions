package P1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class hackerRank {

	public static void JavaVarargs(Integer [] varags) {
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(varags));
		Iterator<Integer> iterator = list.iterator(); 
		
		if(varags.length > 0){
            int sum = 0;
            StringBuilder output = new StringBuilder();
            for(int num : varags){
                sum += num;
                output.append(num);
                output.append('+');        
            }            
            output.setCharAt(output.length()-1, '=');
            System.out.println(output.toString() + sum);
        }
	}
	
	public static String nearestPalindromic(String n) {
		long num = Long.parseLong(n);
		for (long i = 1;; i++) {
			if (isPalindrome1(num - i)) {
				System.out.println("Value of I : " + i);
				return "" + (num - i);
			}
			if (isPalindrome1(num + i)) {
				System.out.println("Value of I : " + i);
				return "" + (num + i);
			}
		}
	}
	
	/*public static String nearestPalindromic1(String n) {
        long num = Long.parseLong(n);
        long temp;
        for (long i = 1;i<num; i++) {
            if (isPalindrome(num - i))
            	temp =num - i;
                //return "" + (num - i);
            if (isPalindrome(num + i))
            	temp =num + i;
                //return "" + (num + i);
        }
		
        return "" + (temp);
    }*/
	
	static boolean isPalindrome1(long x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        return String.valueOf(x)==sb.reverse().toString();
        //return new StringBuffer().reverse().toString()==String.valueOf(x);
    }
	
	
	static boolean isPalindrome(long x) {
        long t = x, rev = 0;
        while (t > 0) {
            rev = 10 * rev + t % 10;
            t /= 10;
        }
        return rev == x;
    }
	
	///check Parenthesis
	public static boolean isValid(String s) {
	    Map<Character, Character> map = new HashMap<>();
	    map.put('(', ')');
	    map.put('[', ']');
	    map.put('{', '}');
	    Stack<Character> stack = new Stack<>();
	    for(char c : s.toCharArray()){
	        if(map.containsKey(c)){
	            stack.push(c);
	        } else if(!stack.empty() && map.get(stack.peek())==c){
	            stack.pop();
	        } else {
	            return false;
	        }
	    }
	    return stack.empty();
	}
	public static void main(String[] args) {
		
		
		
		String str= "{()}[] {";
		
		System.out.println(isValid(str));
		
		System.out.println(nearestPalindromic("189"));
		String s1="anagram";
		String s2="margana";
		
		System.out.println("Java"+10+20);
		System.out.println(10+20+"Java");
		
		char[] ch1 =s1.toLowerCase().toCharArray();
		char[] ch2 =s2.toLowerCase().toCharArray();
				
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		String string = new String(ch1);
		System.out.println(string);
		String string1,string2;
		
		
		// Creating an empty HashMap 
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
		
		StringBuffer sb= new StringBuffer();
		
		for (char c : ch1) {
			
			sb.append(c);
		}
		
		string1= sb.toString();
		
		sb= new StringBuffer();
		
		for (char c : ch2) {
			
			sb.append(c);
		}
		
		string2= sb.toString();
		
		if(string1.equalsIgnoreCase(string2))
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
		
		
		Integer i [] = {1,2,3,4,5,6};
		//JavaVarargs(i);
	}
}
