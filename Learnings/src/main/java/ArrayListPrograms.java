import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.chrome.ChromeOptions;

public class ArrayListPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<String> list = new ArrayList<String>();
		Set<Integer> s=new HashSet<Integer>();
		s.add(10);
		s.add(10);

        System.out.println(s); */

		 
       /* list.add("nashrin");
        list.add("nashrin");
 
        list.add(2.2);
 
        list.add(3.3);
 
        list.add(4.4);
 
       list.add(5.5);
 
        System.out.println(list); */
        
        /*ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);  // Sort cars
       /* for (String i : cars) {
          System.out.println(i);
        }*/
        
        //program using Tree Set
        
        
      /*  Set<String> set=new TreeSet<String>();
        set.add("Bamboo");
        set.add("apple");
        set.add("grapes");
        set.add("Deen");
        set.add("CAM");
        set.add("100");
        
        
        	System.out.println(set);*/
		
		//How to copy array elements from one array to another
		
		/*int[] originalArray = {1, 2, 3, 4, 5};

        // Create a new array of the same length
        int[] copiedArray = new int[originalArray.length];

        // Copy elements one by one
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        // Print copied array
        System.out.print("Copied array: ");
        for (int num : copiedArray) {
            System.out.print(num + " ");*/
		
		
		
		//Program to merge two arrays
		
		 /*int[] arr1 = {1, 2, 3};
	        int[] arr2 = {4, 5, 6};

	        // Create a new array with length = arr1 + arr2
	        int[] merged = new int[arr1.length + arr2.length];

	        // Copy elements from arr1
	        for (int i = 0; i < arr1.length; i++) {
	            merged[i] = arr1[i];
	        }

	        // Copy elements from arr2
	        for (int i = 0; i < arr2.length; i++) {
	            merged[arr1.length + i] = arr2[i];
	        }

	        // Print merged array
	        System.out.println("Merged Array: " + Arrays.toString(merged));*/
		
		
		//program to sort and merge arrays
		 
		 /*int[] a1 = {1, 2, 3};
	        int[] a2 = {6, 5, 4};

	        int[] merged = new int[a1.length + a2.length];
	        int index = 0;

	        // Copy elements of a1 using for-each
	        for (int num : a1) {
	            merged[index++] = num;
	        }

	        // Copy elements of a2 using for-each
	        for (int num : a2) {
	            merged[index++] = num;
	        }

	        // Sort the merged array
	        Arrays.sort(merged);

	        // Print using for-each
	      System.out.print("Output: [");
	        for (int i = 0; i < merged.length; i++) {
	            System.out.print(merged[i]);
	            if (i < merged.length - 1) {
	               System.out.print(", ");
	            }
	        }
	        System.out.println("]");*/
		
	//program to sort,merge and remove duplicates
		/*Set<Integer> uniqueSet = new LinkedHashSet<>();
        uniqueSet.add(5);
        uniqueSet.add(2);
        uniqueSet.add(3);
        uniqueSet.add(1);
        uniqueSet.add(4);

        // Step 1: Convert Set to Array
        int[] array = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            array[index++] = num;
        }

        // Step 2: Sort the array
        Arrays.sort(array);

        // Step 3: Print the array
        System.out.print("Merged, Sorted & Unique Array: ");
        for (int val : array) {
            System.out.print(val + " ");
		
        }*/
		//	//program to sort,merge and remove duplicates

		/*  int[] arr1 = {3, 1, 2, 2};
	        int[] arr2 = {4, 3, 5, 6};

	        // Step 1: Merge the arrays
	        int[] merged = new int[arr1.length + arr2.length];
	        int index = 0;

	        for (int i = 0; i < arr1.length; i++) {
	            merged[index] = arr1[i];
	            index++;
	        }

	        for (int i = 0; i < arr2.length; i++) {
	            merged[index] = arr2[i];
	            index++;
	        }

	        // Step 2: Add merged elements to a Set to remove duplicates
	        Set<Integer> uniqueSet = new LinkedHashSet<>();
	        for (int i = 0; i < merged.length; i++) {
	            uniqueSet.add(merged[i]);
	        }

	        // Step 3: Convert Set back to array
	        int[] result = new int[uniqueSet.size()];
	        int i = 0;
	        for (int num : uniqueSet) {
	            result[i++] = num;
	        }

	        // Step 4: Sort the array
	        Arrays.sort(result);

	        // Step 5: Print the final array
	        System.out.print("Merged, Sorted & Unique Array: ");
	        for (int num : result) {
	            System.out.print(num + " ");
        
	        }
        }
	
       //program to sort an array without using Arrays.sort() method in descending order
	  /* int[] arr = {4, 2, 1, 5, 3};

       // Sorting the array manually (Descending)
       for (int i = 0; i < arr.length; i++) {
           for (int j = i + 1; j < arr.length; j++) {
               if (arr[i] < arr[j]) {
                   // Swap arr[i] and arr[j]
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
       }

       // Printing the sorted array
       System.out.print("Sorted Array (Descending): ");
       for (int num : arr) {
           System.out.print(num + " ");
       }
        
}*/
//program to sort an array without using Arrays.sort() method in ascending order
	/*int[] arr = {4, 2, 1, 5, 3};

    // Sorting the array manually
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    // Printing the sorted array
    System.out.print("Sorted Array: ");
    for (int num : arr) {
        System.out.print(num + " ");
    }*/
		
		//program to find common elements between two arrays
		/*int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        System.out.print("Common elements: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break; // Prevents printing duplicates
                }
            }
        }*/
		
		//Merge two arrays in reverse order(2nd array in reverse)
		
		 /*String[] s1 = {"a", "b", "c", "d"};
	        String[] s2 = {"e", "f", "g", "h"};
	        String[] result = new String[s1.length];

	        for (int i = 0; i < s1.length; i++) {
	            result[i] = s1[i] + s2[s2.length - 1 - i];
	        }

	        for (String s : result) {
	            System.out.print(s + " ");
	        }*/
		//program to reverse an array
	  /*   int[] arr = {1, 2, 3};

	        System.out.print("Reversed Array: ");
	        for (int i = arr.length - 1; i >= 0; i--) {
	            System.out.print(arr[i] + " ");
	        }*/
		
		//Program to Rotate an Array by 1 where k=1
		 /* int[] arr = {1, 2, 3, 4, 5};
		  int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;

        System.out.print("Left Rotated Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }*/
		
			//Program to Rotate an Array by right where k=1

	        
	      /*  int[] arr = {10, 20, 30, 40, 50};

	        // Store the last element
	        int last = arr[arr.length - 1];
	        // Shift all elements one position to the right
	        for (int i = arr.length - 1; i > 0; i--) {
	            arr[i] = arr[i - 1];
	        }
	        // Move the last element to the first position
	        arr[0] = last;
	        // Print the rotated array
	        System.out.print("Right Rotated Array: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }*/
		
		//Program to sort an array and convert an array to string using Array.toString()
	     /*   int[] numbers = {5, 3, 1, 4, 2};
	        //System.out.println("Before sorting: " + Arrays.toString(numbers));
	        Arrays.sort(numbers);
	        System.out.println("After sorting: " + Arrays.toString(numbers));*/
		
		//program to reverse an array and store it in new array
		 /*int[] original = {1, 2, 3, 4, 5};
	        int[] reversed = new int[original.length]; // New array to store reversed elements

	        int j = 0; // index for reversed array
	        for (int i = original.length - 1; i >= 0; i--) {
	            reversed[j] = original[i];
	            j++;
	        }

	        // Print the reversed array
	        System.out.print("Reversed Array: ");
	        
	        System.out.println(Arrays.toString(reversed));
	       /* for (int num : reversed) {
	            System.out.print(num + " ");
	        }*/
/*program to find the largest element and min
		int[] arr= {20,10,5,50};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
		if(arr[i]<min)
		{
			min=arr[i];
		}
		}
		System.out.println(min);*/
		/*program to sort the element using bubble sort

		int[] arr = {5, 2, 4, 1, 3};

        // Sorting using basic nested loops (Bubble sort)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap elements
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");*/
		
	        
}

        
        
        

}
