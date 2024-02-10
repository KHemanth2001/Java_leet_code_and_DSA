import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {

        //Intialization
        HashMap<String,Integer> map=new HashMap<>();

        //Insertion
        map.put("China",100);
        map.put("India",120);
        map.put("US",150);
//        System.out.println(map);

        System.out.println(map.get("India"));

        //Iteration
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
        }
    }
}
