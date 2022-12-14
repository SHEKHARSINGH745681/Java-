import java.util.*;
public class Main {
    static Scanner scn=new Scanner(System.in);
    public static void main(String [] args){
        int n=scn.nextInt();
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        insertionsort(arr);
        int target=scn.nextInt();
        for(int i=0;i<n-1;i++){
            int start = i+1, end = n-1;
            while(start < end){
                if(arr[i]+arr[start]+arr[end] == target){
                     System.out.println(arr[i]+", "+arr[start]+" and "+arr[end]);
                     start++;
                     end--;
                }else if(arr[i]+arr[start]+arr[end] < target){
                    start++;
                }else{
                    end--;
                }
            }
        }
         }
    public static void insertionsort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int val=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>val){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=val;
        }
    }
}