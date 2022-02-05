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
		int arr[] = {2,4,53,5,6};  //  => 53,5,6,2,4

		ar.leftRotate(arr, 2, 5);
		ar.printArray(arr, 5);
	}
}


// Time complexity O(d*n)
//Space complexity O(d)
