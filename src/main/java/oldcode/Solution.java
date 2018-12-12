import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i ;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i );
        }
        return result;
    }
    public static void main(String[] args){
        Solution s = new Solution();
        int[] arr = {11,22,44};
        int[] arr1 = s.twoSum(arr,33);
        System.out.println(arr1[0]+" "+arr1[1]);
    }
}
