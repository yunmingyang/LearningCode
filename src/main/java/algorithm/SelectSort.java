public class SelectSort {
    public static void SelectSort(int[] arr){
        int min = 0;
        for (int j = 0;j < arr.length;j++) {
            min = j;//每次把min置为外循环的循环变量值，此是为了将前部已经筛选完最小值隔离
            for (int i = j+1; i < arr.length; i++) {//每次内循环都要比外循环多一个
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }

            int temp = arr[min];
            arr[min] = arr[j];
            arr[j] = temp;

        }
    }


    public static void main(String[] args){
        int[] arr = {1,23,4,5,6,7,7,555,3,23,41};

        SelectSort(arr);
        for (int i = 0; i < arr.length;i++)
            System.out.println(arr[i]);
    }
}
