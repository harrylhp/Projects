package HashTable.Challenge;

import java.util.HashSet;

public class findFirstOccurrence {
    public static void main (String[]args) {
        String str = "Har hehe hoho";
        char [] arrayChar = str.toCharArray();

        HashSet <Character> hSet = new HashSet<>();
        for (int i = 0; i< arrayChar.length; i++){
            if(hSet.contains(arrayChar[i])){
                System.out.println("Char is " + arrayChar[i]);
                break;
            }
            else
                hSet.add(arrayChar[i]);
        }

        System.out.print(hSet + " ");
    }

}
