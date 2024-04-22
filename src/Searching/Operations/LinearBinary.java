package Searching.Operations;

public class LinearBinary {

	public static void main(String[] args) {
		int num[]= {5,7,9,11,13};
		int target=13;
		
		int result1=linearSearch(num, target);
		int result2=binarySearch(num, target);
		if(result1!=-1) {
		System.out.println("Element found at index: "+ result1);
		}
		else {
			System.out.println("Element not Found");
		}
	}

	public static int linearSearch(int[] num, int target) {
		int step=0;
		for(int i=0; i<num.length; i++)
		{
			step++;
			if (num[i]==target) {
				System.out.println("Steps taken for Linear Search: "+ step);
				return i;
			}
		}
		System.out.println("Steps taken for Linear Search: "+ step);
		return -1;
	}

	public static int binarySearch(int[] num, int target) {
		
		//5, 7, 9, 11, 13
		int step=0;
		int left=0;
		int right=num.length-1;
		while(left<=right) {
			step++;
			int mid = (left+right)/2;
			if (num[mid]==target) {
				System.out.println("Steps taken for Binary Search: "+ step);
				return mid;		
			}
			else if (num[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1; 
			}
		}
		System.out.println("Steps taken for Binary Search: "+ step);
		return -1;
	}
}
