package algorithm;


public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {23,2,15,123,44,23,455};
        QuickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void  QuickSort(int[] arr,int low,int high){
        //取KEY值只是为了比较使用，而start和end的交换才是逐渐确定中间位置的过程
        //里层的start小于end是为防止end或者start的移动过度
        //外层的start小于end是为了防止当前遍历期间未分段完成
        //最后的if是为了防止无限递归
        //内层循环不能等于，否则在第一个数字为最小值时候会无法排序
        int start = low;
        int end = high;
        int key = arr[start];
        while(start < end){
            while(start < end && key <= arr[end])
                end--;
            swap(arr,start,end);
            while(start < end && key >= arr[start])
                start++;
            swap(arr,start,end);
        }
        if(start>low)QuickSort(arr,0,start - 1);
        if(end<high)QuickSort(arr,end + 1,arr.length - 1);
    }
}
