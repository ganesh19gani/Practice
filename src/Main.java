import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

       String str = "GaneshAdapa";
        Map<Character,Integer> hmap = new HashMap<>();
        for(int i = 0; i<str.length(); i++){
           if(hmap.containsKey(str.charAt(i))){
               int count = hmap.get(str.charAt(i));
               hmap.put(str.charAt(i),count++);
           } else {
               hmap.put(str.charAt(i), 1);
           }
        }

    }
}