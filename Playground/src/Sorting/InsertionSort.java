package Sorting;

public class InsertionSort{
    public static void main(String[] args) {
        int[] array = new int[]{9, 7, 3, 8, 1, 6, 6, 7, 7};
        int i,j, key;

        for (i=1; i<array.length;i++){
            key = array[i];
            j=i-1;

            while(j>=0 && key<array[j]) {
                swap(array, j, j+1);
                j--;
            }
        }

        for (i=0 ; i<array.length;i++)
            System.out.println(array[i]);
    }

public static void swap(int[] array, int i, int j){
        if(i==j)
        return;

        int temp;
        temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        }
}
