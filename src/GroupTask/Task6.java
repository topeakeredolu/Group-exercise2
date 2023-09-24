package GroupTask;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
  public static char nonRepeatingChar(String str){
      Map<Character, Integer> cMap=new HashMap<>();
      for(char c : str.toCharArray()){
          cMap.put(c,cMap.getOrDefault(c,0)+1);
      }
      for(char c: str.toCharArray()){
          if(cMap.get(c)==1){
              return c;
          }
      }
      return '\0';
  }

    public static void main(String[] args) {
        String str1="ggggggh";
        char val=nonRepeatingChar(str1);
        if(val!='\0'){
            System.out.println(val);
        }else{
            System.out.println("No repeating value");
        }
    }
}
