package LeetCode;

public class TwoSum {
    public static void main(String[]args){
        int[] array = new int[]{9, 7, 3, 8, 1, 6, 7, 10,5};

        int[] array1 = new int[]{-3,4,3,0};
        int [] result = findTwoSum(array1, 0);
        for(int i=0; i<result.length;i++)
            System.out.println(result[i]);

    }

    public static int[] findTwoSum(int []array, int sum){
        int i=0;
        int j=0;
        int [] result = new int[2];

        for(i=0; i<array.length;i++){
            for(j=0;j<array.length;j++){
                if(i!=j && (array[i]+array[j] ==sum)){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}

