class JugglingRotate {

    // reverse array rotation
    void rotate(int arr[], int start, int end) {
       int temp;
       while(start < end) {
           temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
    }

    void reverseRotate(int arr[], int d, int n) {
        rotate(arr, 0 , d-1);
        rotate(arr, d, n);
        rotate(arr, 0, n  );
    }

    void printArray(int arr[], int s){
        for(int i = 0; i < s; i++) {
          System.out.print(arr[i] + " ");
        }
    }



}


class RotateArray {

    // function to rotate array
    void leftRotate(int arr[], int d, int s) {
     //rotate the array one by one 
    	for(int i = 0; i < d; i++) {
    		rotateArray(arr, s);
    	}
    }
    
    void rotateArray(int arr[], int s) {
       int temp = arr[0];
       int i = 0;
       while(i < s -1){
       	 arr[i] = arr[i + 1];
       	 i++;
       }
       arr[i] = temp;
    }

    void printArray(int arr[], int s){
    	for(int i = 0; i < s; i++) {
    	  System.out.print(arr[i] + " ");
    	}
    }

	public static void main (String[] args) {
		// object created 
		RotateArray ar = new RotateArray();
		JugglingRotate obj = new JugglingRotate();
		int arr[] = {2,4,53,5,6};  //  2,4,53,5,6,5 => 53,5,6,5,2,4

		// ar.leftRotate(arr, 2, 5);
		// ar.printArray(arr, 5);
		obj.reverseRotate(arr,2, 4);
		obj.printArray(arr, 5);
	
	}
}

/*   1, 2, 3, 4, 5 => 3, 2, 5, 4, 5


*/

