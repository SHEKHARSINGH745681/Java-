package lec6;

public class swap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int[]arr= {2,3,1,4,5,6};
		System.out.println(arr[0]+" "+arr[1]);
		Swap(arr,0,1);
		//
		System.out.println(arr[0]+" "+arr[1]);
		
	}
	public static void Swap(int[}arr,int i,int j) {
		int temp=arr[i];
		arr[0]=arr[1];
		arr[1]=temp;
	}

}
