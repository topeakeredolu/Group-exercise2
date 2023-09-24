package GroupTask;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        String s1="   LISTEN  ";
        String s2="silent  ";
        if(anagramCheck(s1,s2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not anagrams");
        }

        }
    static boolean anagramCheck(String s1, String s2){
        s1=s1.toLowerCase().trim();
        s2=s2.toLowerCase().trim();
        if(s1.length()!=s2.length()){
            return false;

        }
        char [] stringToArray1=s1.toCharArray();
        char [] stringToArray2=s2.toCharArray();
        Arrays.sort(stringToArray1);
        Arrays.sort(stringToArray2);
        for (int i = 0; i < s1.length(); i++) {
            if(stringToArray1[i]!= stringToArray2[i]){
                return false;
            }

        }
        return true;

    }
}
