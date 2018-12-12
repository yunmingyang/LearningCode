public class MergeSort {
    public static void mergeSort(int[] arr){
        sort(arr,0,arr.length-1);//此处减一是为了配合下标
    }
    public static void sort(int[] arr,int left,int right){
        if(left >= right)
            return;
        int mid = (left + right) / 2;
        sort(arr,left,mid);
        sort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    public static void merge(int[] arr,int left,int leftLast,int right){
        int[] temp = new int[arr.length];
        int righFirst = leftLast+1;
        int tempIndex = left;
        int tempLeft = left;
        while (left <= leftLast && righFirst <= right){
            if (arr[left] <= arr[righFirst]) {//此处应是左和右初开始比,若和左后开始比则会一直保持原样
                temp[tempIndex++] = arr[left++];
            }else {
                temp[tempIndex++] = arr[righFirst++];
            }
        }
        while (left <= leftLast){
            temp[tempIndex++] = arr[left++];
        }
        while (righFirst <= right){
            temp[tempIndex++] = arr[righFirst++];
        }
        while(tempLeft <= right){
            arr[tempLeft] = temp[tempLeft++];
        }
    }
    public static void main(String[] args) {
        int[] arr = {123,234,5,324,2,1,43};
        mergeSort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i = 0;i < arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
