package Collections.ArrayList.DSA;

public class Arrays2D {
	public static void main(String[] args) {
		int arr[][]=new int[5][6];
		
		//set
		arr[1][3]=10;
		//get
		System.out.println(arr[1][3]);	//10
		System.out.println(arr[2][5]);	//0

		//row count
		System.out.println(arr.length);
		
		//column count
		System.out.println(arr[0].length);
				
		//traversal
		for(int i=0; i<arr.length; i++) {	//i -> row no
			for(int j=0; j<arr[0].length; j++) {	//j -> col no
				//processing
			}
		}
	}
}