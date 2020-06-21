//Array Rotation using a temp variable  O(n+d)

//Array Rotation using a single loop  O(n)





package basicAlgo;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Array Size:");
		int n = sc.nextInt(); //Get the size
		
		int arr[]= new int[n];
		
		System.out.println("Array Elements:");
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt(); //Get the array elements
		}
		
		System.out.println("Rotation Number:");
		int d = sc.nextInt();
		
		//arr=rotate(arr,n,d);   // METHOD 1 -> O(n+d)-two loops
		
		arr=rotate1(arr, n, d); // METHOD 2 -> O(N)-1 loop
		
		
		
		System.out.println("updated Array Elements:");
		for(int i=0;i<n;i++) {
			
			System.out.print(arr[i]+" "); //Print the rotated array
		}
		
		sc.close();
  }
	
	/**
	 METHOD 1 
	 Complexity - O(n+d)
	 */
	public static int[] rotate(int arr[],int size, int rotation_index) {
     int rotated_arr[] = new int[size];
     
     int i=0;
     int d=rotation_index;
     while(d<size) {
    	 rotated_arr[i]=arr[d];
    	 i++;
    	 d++;
     }
     
     d=0;
     while(d<rotation_index) {
    	 rotated_arr[i]=arr[d];
    	 i++;
    	 d++;
     }
     
     return rotated_arr;
		
	}
	
	/**
	 Method 2 
	 Complexity -  O(n)
	 * @return
	 */
	public static int[] rotate1(int arr[],int size, int rotation_index) {
		
		int rotated_arr[] = new int[size];
		
		for(int i=0;i<size;i++) {
			int newIndex = (i + (size-rotation_index))%size;
			rotated_arr[newIndex]= arr[i];
		}
		
		return rotated_arr;
	}

}
