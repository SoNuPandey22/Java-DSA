import java.util.*;

class RotatedSearch {

	public static void RotateArray(int arr[], int d, int n) {
      int temp = arr[0];
      int j = 0;
      while(j < d) {
      	  int i =0;
      	  temp = arr[0];
      	  for(i; i < n - 1; i++) {
	      	arr[i] = arr[i+1];
	      }
	      arr[i] = temp;
      }
    
	}

	// search from the rotated array
	public static int search(int arr[], int l, int h, int key) {
      if (l >= h)
      	return -1;
      int mid = (l + h)/ 2;
      if(arr[mid] == key)
      	return mid;
      if(arr[l] <= arr[mid]) {
      	if(key >= arr[l] && key <= arr[mid]) {
      		// key lies between low and mid 
      		return search(arr, l, mid-1; key);
      	}
      	return search(arr, mid+1, h, key);
      }
      if(key > arr[mid]) 
      	return search(arr, mid+1, h, key);
      return(arr,l, mid-1, key);

	}

	// driver code

	public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n,d, key;
     System.out.println("Enter the size of the array");
     int arr[n];
     n = sc.nextInt();
     System.out.println("Enter the elements of the array");
     for(int i =0; i < n; i++) {
         arr[i] = sc.nextInt();
     }
     System.out.println("Enetr the element from which you want to rotate the array");
     d = sc.nextInt();
     System.out.println("Enter the key to be search in the array");
     RotateArray(arr, d, n);
     int indx =  search(arr, 0, n, key);
     System.out.println("the answer is found at the index", indx);

	}
}