package lec6;
import java.until.Scanner;
public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int[]={2,3,1,4,5,6};
		System.out.println(Search(arr,4));
		}
    public static int Search(int[],int item) {
    	for(int i =0;i<arr.length;i++) {
    		if(arr[i]==item) {
    			return i;
    		}
    	}
    	
    	return-1;
		

	}
}
