package GroupTask;

public class Task8 {
    public static String Increment(String str){
        int num=Integer.valueOf(str);
        num++;
        return Integer.toString(num);
    }
    public static void main(String[] args) {String input1="123";
        String input2="53456";
        String input3="29";

        System.out.println(Increment(input1));
        System.out.println(Increment(input2));
        System.out.println(Increment(input3));




    }
}
