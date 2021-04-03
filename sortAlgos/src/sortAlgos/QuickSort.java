package sortAlgos;

public class QuickSort {
	
	public static void sort(Integer[] arr, int low, int high) {
		
		if(arr==null || arr.length==0) return;
		
		if(low>=high) return;
		
		int middle=low+(high-low)/2;
		int pivot=arr[middle];
		
		int i=low, j=high;
		
		while(i<=j) {
			
			while(arr[i]<pivot) i++;
			
			while(arr[j]>pivot) j--;
			
			if(i<=j) {
				
				swap(arr, i, j);
				i++;
				j--;
				
			}
		}
		
		if(low<j) sort(arr, low, j);
		
		if(high>i) sort(arr, i, high);		
		
	}
	
	public static void swap(Integer[] arr, int i, int j) {
		
		arr[i]=arr[i]+arr[j];
		arr[j]=arr[i]-arr[j];
		arr[i]=arr[i]-arr[j];
		
	}

}
