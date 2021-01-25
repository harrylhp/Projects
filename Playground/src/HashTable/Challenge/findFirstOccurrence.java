package HashTable.Challenge;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MultiHashtable;

import java.util.HashSet;
import java.util.Hashtable;

public class findFirstOccurrence {
    public static void main (String[]args) {
        String str = "Har hehe hoho";
        char [] arrayChar = str.toCharArray();
        int i;

        HashSet <Character> hSet = new HashSet<>();
        for (i = 0; i< arrayChar.length; i++){
            if(hSet.contains(arrayChar[i])){
                System.out.println("Char is " + arrayChar[i]);
                break;
            }
            else
                hSet.add(arrayChar[i]);
        }

        System.out.print(hSet + " ");
        System.out.println();

        Hashtable <Character, Integer> hTable = new Hashtable<>();
        for (i=0; i<arrayChar.length; i++){
            if (hTable.containsKey(arrayChar[i])){
                System.out.println("Char is " + arrayChar[i]);
                break;
            }
            else
                hTable.put(arrayChar[i],i);
        }
        System.out.print(hTable + " ");
    }

}
