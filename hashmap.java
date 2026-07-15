import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        map.put(1,2);
        map.put(2,3);
        for(int key:map.keySet()){
            System.out.println(map.get(key));
        }
    }    
}