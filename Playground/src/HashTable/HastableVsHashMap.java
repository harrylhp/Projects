package HashTable;// A sample Java program to demonstrate HashMap and HashTable
import java.util.*;
import java.lang.*;
import java.io.*;

public class HastableVsHashMap{

    /* Name of the class has to be "Main" only if the class is public. */
    public static void main(String args[]){
        //----------Hashtable -------------------------
        Hashtable<Integer,String []> ht=new Hashtable<Integer,String[]>();
        ht.put(101,new String[]{"Harry", "0101"});
        ht.put(102,new String[]{"Harry", "0102"});
        ht.put(103,new String[]{"Harry", "0103"});

        System.out.println("--Hash table 1 Common Way to print out--");
        for (Map.Entry m:ht.entrySet()) {
            System.out.println(m.getKey()+" "+ m.getValue()); //It seems using this way not able to print String[0] or String[1]
        }

        Enumeration<Integer> keys = ht.keys();
        while(keys.hasMoreElements()){
            Integer key = keys.nextElement();
            System.out.println("Value of "+key+" is: "+ ht.get(key)[1]);
        }

        Hashtable<Integer,String> ht2 =new Hashtable<Integer,String>();
        ht2.put(100,"Amit");
        ht2.put(104,"Amit");  // hash map allows duplicate values
        ht2.put(101,"Vijay");
        ht2.put(102,"Rahul");

        System.out.println("--Hash table 2 Common Way to print out--");
        for (Map.Entry m:ht2.entrySet()) {
            System.out.println(m.getKey()+" "+ m.getValue()); //It seems using this way not able to print String[0] or String[1]
        }


        //----------------HashMap--------------------------------
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(100,"Amit");
        hm.put(104,"Amit");  // hash map allows duplicate values
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");
        System.out.println("--Hashmap Common Way to print out--");
        for (Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}

