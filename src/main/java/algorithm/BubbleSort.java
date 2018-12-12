public class BubbleSort {
    public static void BubbleSort(int[] arr){
        for(int i = 0;i < arr.length;i++){
            for(int j = 1;j < arr.length;j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void BubbleSort(int[] arr,boolean flag){//优化一下，flag为区别原方法
        flag = true;
        while(flag){
            flag =false;
            for (int i = 1;i < arr.length;i++){//也就是说,当本次循环中有交换发生,就将flag置为true，从而继续循环
                if (arr[i-1] > arr[i]){
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    flag = true;
                }
            }
        }
    }



    public static void main(String[] args){
        int arr[] = {12,23,4,5,6,1,1,23,4,4,2,2,3,23};
        BubbleSort(arr,false);
        for (int i = 0;i < arr.length;i++)
            System.out.println(arr[i]);
    }
}
