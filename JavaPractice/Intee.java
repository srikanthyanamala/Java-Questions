package P1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Intee {

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
	
	public static void printSubArrays(int [] arrA){

        int arrSize = arrA.length;
        ArrayList<Integer> list= new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> mainLst= new ArrayList<ArrayList<Integer>>();
        //start point
        for (int startPoint = 0; startPoint <arrSize ; startPoint++) {
            //group sizes
        	
            for (int grps = startPoint; grps <=arrSize ; grps++) {
                //if start point = 1 then
                //grp size = 1 , print 1
                //grp size = 2, print 1 2
                //grp size = 3, print 1 2 3 ans so on
            	list = new ArrayList<Integer>();
                for (int j = startPoint ; j < grps ; j++) {
                    //System.out.print(arrA[j] + " ");
                    list.add(arrA[j]);
                }
                if(list.size() >= 1) mainLst.add(list);
               // System.out.println();
            }
        }
        System.out.println(mainLst);
    }

	public static void main(String[] args) {
		
		int[] nums = { 1, 2, 3, 4 };
		
		//System.out.println(subsets1(nums));
		int [] arrA = {1,2,3, 4};
        printSubArrays(arrA);	
		
		 int sum=0;            

	        Scanner input = new Scanner(System.in);            

	        int i=1;

	        int [] array = new int[i];

	        while( i > array.length || sum <= 100) {

	          System.out.println("Write in the " + i + " number") ; 
	          array[i]=input.nextInt();
	          sum=+array[i];
	           System.out.println("sum is " + sum); 

	        }            

	}
}
