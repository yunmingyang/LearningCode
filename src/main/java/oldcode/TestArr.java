public class TestArr {
    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        int a[] = new int[5];
        int temp = 10;
        for(int i=0;i<5;i++){
            a[i] = temp;
            System.out.printf("a[%d] is %d\n",i,a[i]);
            temp += 10;
        }



        int[][] arr = new int[3][4];
        int temp_1 = 1;
        for(int i = 0;i < 3;i++){
            for (int l = 0;l < 4;l++){
                arr[i][l] = temp_1;
                temp_1 += 1;
                System.out.printf("a[%d][%d] is %d\n",i,l,arr[i][l]);
            }
        }



        Class c = arr.getClass();
        String name = c.getName();
        System.out.printf("%s",name);



        char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
        char[] copyTo = new char[7];


        System.arraycopy(copyFrom,2,copyTo,0,7);

        System.out.println(copyTo);
    }
}
