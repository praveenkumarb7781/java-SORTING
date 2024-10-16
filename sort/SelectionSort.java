package sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		 int arr[]= {5,1,2,3,4};
		 selection(arr);
		 System.out.println(Arrays.toString(arr));
	}

	public static void selection(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int last=arr.length-i-1;
			int maxindex=maxIndex(arr,0,last);
			swap(arr,maxindex,last);
		}
		
	}

	public static void swap(int[] arr, int maxindex, int last) {
		int temp = arr[maxindex];
		arr[maxindex]=arr[last];
		arr[last]=temp;
		
	}

	public static int maxIndex(int[] arr, int strt, int last) {
		int max=strt;
		for(int i=strt;i<=last;i++) {
			if(arr[max]<arr[i]) max=i;
		}
		return max;
	}

	

	

}
