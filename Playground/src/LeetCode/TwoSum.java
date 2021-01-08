package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[]args){
        int[] array = new int[]{9, 7, 3, 8, 1, 6, 7, 10,5};

        int[] array1 = new int[]{-3,4,3,0};
        int [] result = findTwoSum(array1, 0);

        for(int i=0; i<result.length;i++)
            System.out.println(result[i]);

        int [] result2 = findTwoSumHash(array, 8);
        for(int i=0; i<result2.length;i++)
            System.out.println(result2[i]);
    }

    // O(n2) as time complexity, too slow !
    public static int[] findTwoSum(int []array, int sum){
        int i=0;
        int j=0;
        //int [] result = new int[2];

        for(i=0; i<array.length;i++){
            for(j=0;j<array.length;j++){
                if(i!=j && (array[i]+array[j] ==sum)){
                    //result[0]=i;
                    //result[1]=j;
                    //return result;
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] findTwoSumHash(int []array, int sum){
        Map<Integer,Integer> ht = new HashMap<Integer,Integer>();

        for (int i=0; i< array.length; i++){
            int complement = sum - array[i];
            if (ht.containsKey(complement) && ht.get(complement)!=i)
                return new int[] { ht.get(complement),i };
            else
                ht.put(array[i],i);
        }

        return null;

    }

}

