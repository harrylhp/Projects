package Recursion;

import java.util.ArrayList;

public class Fibonacci {
    public static void main(String[]args){

        //Print out the number at position x
        System.out.println("Fibonacci is " + fibonacci(6));

        System.out.println("Fibonacci Iteratively is " + fibonacciIteratively(6));
}

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    public static int fibonacci(int num){
        if (num < 2)
            return num;

        return fibonacci(num-1) + fibonacci(num-2);
    }

    public static int fibonacciIteratively(int num){
        //int [] array = new int[] {0,1};
        ArrayList <Integer> array = new ArrayList<>();
        array.add(0);
        array.add(1);

        if (num < 2)
            return num;

        for (int i =2; i<=num; i++){
            array.add(array.get(i-2)+array.get(i-1));
        }
        System.out.println(array);

        return array.get(num);
    }
}
