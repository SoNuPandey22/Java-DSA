class SearchRotated {

	public int sum(int a , int b) {
		return a + b;
	}
	public int subtract(int a , int b) {
		return a - b;
	}

	public static void main(String [] args) {
		int a = 4;
		int b = 5;

        SearchRotated add = new SearchRotated();
        // int ans = add.sum(6,9);
        int ans = add.subtract(9,5);
        System.out.println(ans);

	} 
}