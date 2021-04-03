package sortAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) 
    {
        
		int size;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter size of array : ");
		size=sc.nextInt();
		
		Integer[] arr=new Integer[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array elements are : " + Arrays.toString(arr));
		
		QuickSort.sort(arr,0,arr.length-1);
		
		System.out.println("Array elements after sorting are : " + Arrays.toString(arr));
		
		sc.close();
		
    }

}
