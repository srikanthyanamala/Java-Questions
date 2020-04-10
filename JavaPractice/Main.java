
package P1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

// Base Class 
class Parent { 
	
	void show() 
    { 
        System.out.println("Parent's show()"); 
    } 
} 
  
// Inherited class 
class Child extends Parent { 
    // This method overrides show() of Parent 
    @Override
    void show() 
    { 
        System.out.println("Child's show()"); 
    } 
} 
  
// Driver class 
class Main { 
    public static void main(String[] args) 
    { 
        // If a Parent type reference refers 
        // to a Parent object, then Parent's 
        // show is called 
        Parent obj1 = new Parent(); 
       // obj1.show(); 
  
        // If a Parent type reference refers 
        // to a Child object Child's show() 
        // is called. This is called RUN TIME 
        // POLYMORPHISM. 
        Parent obj2 = new Child(); 
        obj2.show(); 
        
        
        Map<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(5, "A");
		hMap.put(11, "C");
		hMap.put(4, "Z");
		hMap.put(77, "Y");
		hMap.put(9, "P");
		hMap.put(66, "Q");
		hMap.put(0, "R");
		
		
		hMap = new HashMap<Integer, String>();
		hMap.put(5, "A");
		hMap.put(11, "C");
		hMap.put(4, "Z");
		hMap.put(77, "Y");
		hMap.put(9, "P");
		hMap.put(66, "Q");
		hMap.put(0, "R");
		
		
		System.out.println("Concurent iteration order =======");
		
		Map<Integer, String> tMap = new ConcurrentHashMap<Integer, String>();
		tMap.put(5, "A");
		tMap.put(11, "C");
		tMap.put(4, "Z");
		tMap.put(77, "Y");
		tMap.put(9, "P");
		tMap.put(66, "Q");
		tMap.put(0, "R");
		
		for (Map.Entry<Integer, String> entry : tMap.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		
		
		System.out.println("HashMap iteration order =======");
		for (Map.Entry<Integer, String> entry : hMap.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		System.out.println("\nTreeMap iteration order =======");
		for (Map.Entry<Integer, String> entry : tMap.entrySet()) {
			//System.out.println(entry.getKey() + " = " + entry.getValue());
		}

    } 
}