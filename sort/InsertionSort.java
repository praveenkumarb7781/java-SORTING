package sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1};
		insertion(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void insertion(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				swap(arr,j,j-1);
			}
		}
		
	}

	public static void swap(int[] arr, int j, int i) {
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}

}
