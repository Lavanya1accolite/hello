import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapping {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap();
        map.put("name","Lavanya");
        map.put("class","10");
        Set<String> key=map.keySet();

        for(String k:key){
            System.out.println(k+" "+map.get(k));

        }

    }
}
