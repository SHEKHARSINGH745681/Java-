package lec6;

public class swap_demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {2,3,1,4};
		int[]other= {20,13,11,9};
		System.out.println(arr[0]+" "+other[0]);
		Swap(arr,other);
		System.out.println(arr[0]+" "+other[0]);

	}

	private static void Swap(int[] arr, int[] other) {
		// TODO Auto-generated method stub
		int[]temp=arr;
		arr=other;
		other=temp;
		
	}

}
