package Recursion;

public class Factorial {
    public static void main(String[]args){

        System.out.println("Factorial is " + factorial(5));
        System.out.println("Factorial Iteratively is " + factorialIteratively(5));
    }

    public static int factorial(int num){
        if (num == 2)
            return 2;

        return num*factorial(num-1);
    }

    public static int factorialIteratively(int num){
        int fac = 1;
        if (num == 1)
            return 1;

        for (int i = 2; i<= num; i++){
            fac *=i;
        }
        return fac;
    }
}
