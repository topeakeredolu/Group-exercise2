package GroupTask;

public class Task3 {
    public static void main(String[] args) {
        String str = "madam";
       String reverse="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);

        }
        if(str.equals(reverse)){
            System.out.println("String is a Palindrome");
        }else{
            System.out.println("String is not a Palindrome");
        }



    }
}
