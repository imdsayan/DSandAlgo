//Array rotation using Array Reversal - O(n)


package basicAlgo;

public class ReversalRotation {

	public static void main(String[] args) {
      
		
		int arr[] = {3,1,7,8,4,6,9};
		int n= arr.length;
		int d= 6;
		
		//check if d is greater than array length
		d=d%n;
		reverseArray(arr, 0, d-1);
		reverseArray(arr, d, n-1);
		reverseArray(arr, 0, n-1);
		for(int i:arr) {
			System.out.println(i);
		}
}
	public static void reverseArray(int arr[],int first, int end) {
		while(first<end) {
			int temp = arr[first];
			arr[first] = arr[end];
			arr[end]=temp;
			first++;
			end--;
		}
	}
	

}
