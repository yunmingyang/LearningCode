public class InsertSort {
    public static void InsertSort(int[] arr){
        int temp = 0;
        int j =0;
        for (int i = 1;i < arr.length;i++){
            temp = arr[i];//记住当前未排序元素
            for (j = i - 1;j >= 0 && arr[j] > temp; j--){//由于此处使用&&所以实际上是可以将j=-1时短路，防止arr[j]出现越界
                arr[j+1] = arr[j];//向后挪
            }
            arr[j+1] = temp;//找到插入位置
        }
    }


    public static void main(String[] args){
        int[] arr = {12,3,45,234,345,666,78};
        InsertSort(arr);
        for(int i = 0;i < arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
