public class GenericMethod {
    public static <e> void print(e[] arr){
        if(arr == null){
            System.out.println("请输入一个有效得数组");
            return;
        }
        for(e i:arr){
            System.out.println(i);
        }
    }
    public static <T extends Comparable<T>> T max(T x,T y,T z){
        T max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }
    public static void main(String[] args){
        Integer[] arr = {1,2,3,1};//此时若将arr类型申请为int则会报错，因此泛型时，不可为原始类型
        Double[] arr1 = {1.0,2.0,3.0,4.0,5.0};
        Short[] arr2 = {1,2,3,4,5,6};

        print(arr);
        print(arr1);
        print(arr2);

        max(1,2,3);

    }
}