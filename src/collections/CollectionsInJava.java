package collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsInJava {	

	public static void main(String[] args) {
		
		/***** Array  *****/	
		// Array is a data type , that can store multiple values with similar data type together at one place		

		String [] empNames = new String[3]; // This can hold 3 employee names.
		empNames[0] = "Bharath";
		empNames[1] = "ABC";
			
		System.out.println(empNames.length);	
		
		/**** Challenges with Arrays ****/
		// 1. Arrays are fixed in size
		// 2. Memory will be allocated at the beginning of creating array / static memory allocation
		// 3. Array allows similar data types only
		// 4. Modifications also not allowed
		
		/******* Collections Framework *******/

		// Advantages

		// 1. Collections are dynamic in size. that means , no need to declare the size at the beginning
		// 2. Memory will be allocated dynamically based on the data that we are going to add/store
		// 3. Collections allows different data types in same data structure
		// 4. Modifications are allowed
		
		
		// Major Collection Categories ==> List , Set , Map 
		
		//List ==> ArrayList , LinkedList
		
		// 1. List can store multiple values with similar data type together at one place by allocating the memory dynamically		
		// 2. List can follow dynamic memory allocation
		// 3. List allows modifications
		// 4. List allows duplicate values
		
		//Set ==> HashSet , LinkedHashSet , TreeSet
		
		// 1. Set can store multiple values with similar data type together at one place by allocating the memory dynamically
		// 2. Set can follow dynamic memory allocation
		// 3. Set allows modifications
		// 4. Set does not allow duplicate values
		
		//Map ==> HashMap , LinkedHashMap , TreeMap, Hashtable
		
		// 1. Map can store multiple values with different data types in the form of key and value together at one place by allocating the memory dynamically
		// 2. Map can follow dynamic memory allocation
		// 3. Map allows modifications
		// 4. Map does not allow duplicate keys, but allows duplicate values
		
		// Differences between each sub categories of List , Set and Map 
		
		// Order of Storing the values
		// Allowing null values
		// Memory allocation techniques
		
		/************************  ArrayList  *************************/
		
		System.out.println("********** ArrayList **********");
		// Syntax to Initialize: List<DataType> variable = new ArrayList<DataType>();
		// Syntax to add data: variable.add(value);
		// Syntax to remove the data: variable.remove(value);
		// Syntax to get the size: variable.size();
		// Syntax to get the value: variable.get(index);
	
		// ArrayList follows insertion order
		// ArrayList allows null values
		// ArrayList follows contiguous memory allocation		
		
		//Store Employee names using ArrayList
		List<String> variable = new ArrayList<String>();
		variable.add("Bharath");
		variable.add("ABC");
		variable.add("XYZ");
		variable.add("ABC");
		variable.add(null);
		variable.remove("ABC");
		System.out.println(variable.size());
		System.out.println(variable.get(2));
		System.out.println(variable);
		
		
	
				
				
		
		

	}

}
