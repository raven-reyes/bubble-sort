import java.util.Arrays;
//Recursive bubble sort
public class BubbleSort {
	public static void bubblesort(int arr[], int n) {
		int temp; //temporary variable to store elements before swapping
		if(n==1) { //base case. if array has one element return that element
			return;
		}
// the time complexity this algorithm will take to run is O(n * n) because
//for every recursive call we make that is everytime we call this bubblesort,we make n - 1 comparisons
// so if we make n recursive calls,then the time complexity is O(n(n-1)) which is equals to O(n*n)
// O(n - 1) gets simplified to just O(n)
// the auxilliary space of this algorithm is O(1) constant time because of the temp variable
		for(int i = 0 ; i < n-1 ;i++) { // for loop for traversing/looping through the elements 
			if(arr[i] > arr[i+1]) { // comparing current array element with its next element
				                    // if current element is greater than its next element, swap them
				temp = arr[i+1];   // hold the next array element arr[i + 1] in a temp storage
				arr[i + 1] = arr[i]; // at the place of arr[i + 1] store arr[i]
				arr[i]= temp;//and at the place of arr[i] store arr[i + 1] which you have stored
				             // temporarily in temp
			}
// after the first bubble sort call 
//the largest element in the array will be at the end of the array(at its correct position
// recur on the remaining array elements 
//and on every recursive call,the next largest element will be placed at its correct position
			bubblesort(arr, n-1); 
		}
	}
	// example driver code
	public static void main(String[] args) {
		int n = 11; // the length of the array
		int arr[]= {23, -98, 10 , 1 , 45, 1000, 234, 87, -2000, 100,23,}; // the array
		bubblesort(arr,n); // calling the bubble sort function
		System.out.println(Arrays.toString(arr)); // printing the array
	}

}
