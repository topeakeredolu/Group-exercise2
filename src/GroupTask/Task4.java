package GroupTask;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Task4 {
    public static void main(String[] args) {
        String str="I, love, Java";
        StringTokenizer st=new StringTokenizer(str);
        System.out.println(st.countTokens());
        System.out.println("********************************");
        String [] strArr=str.split(" ");
        System.out.println(strArr.length);

    }

}
