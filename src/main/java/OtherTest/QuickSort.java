package OtherTest;

/**
 * Created by yangyunming on 2018/7/10
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {23,2,15,123,44,23,455};
        QuickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void  QuickSort(int[] arr,int low,int high){
        int start = low;
        int end = high;
        int key = arr[start];
        while(start < end){
            while(start < end && key <= arr[end])
                end--;
            if(key >= arr[end]){
                int temp = key;
                key = arr[end];
                arr[end] = temp;
            }
            while(start < end && key >= arr[start])
                start++;
            if(key <= arr[start]){
                int temp = key;
                key = arr[start];
                arr[start] = temp;
            }
        }
        if(start > low)QuickSort(arr,0,start-1);
        if(end < high)QuickSort(arr,end+1,high);
    }
}
