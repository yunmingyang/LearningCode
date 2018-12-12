public class TestArr {
    void SelectMax(double[] mArr){
        for(int i = 0;i < 10;i++){
            int max = (int)mArr[i];
            if( i != 0){
                if(max < mArr[i]){
                    max = (int)mArr[i];
                }
            }
            System.out.println("max is :" + max);
        }
    }

    double[] InitArr(double[] mArr){
        for(int i=0;i<10;i++) {
            mArr[i] = i * 10;
            //System.out.println(mArr[i]);
        }
        return mArr;
    }

    void PrintArr(double[] mArr){
        for(int i =0;i < mArr.length;i++){
            System.out.println(mArr[i]);
        }
    }

    public static void main(String[] args){
        double[] mArr = new double[10];
        System.out.println(mArr[1]);
        TestArr Ta = new TestArr();
        double[] mDarr = Ta.InitArr(mArr);
        Ta.PrintArr(mDarr);
        Ta.PrintArr(mArr);
        Ta.SelectMax(mArr);



        double[] mList = {1,2,2,3,4,5,6};

        for(double e : mList){
            System.out.println(e);
        }
    }
}
