package DemoCollection;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectionMap {
    public static void main(String[] args) {

        //khai báo Map
        //không lưu đc giá trị key trùng lặp
        Map<String, String> map= new HashMap<>();

        Map<Integer, Double> map2= new HashMap<>();
        map.put("my Name","Hao");
        map.put("how old are u ?","I'm Good!");

        map2.put(1,9.6D);
        map2.put(89,98.6D);

        System.out.println("Map 1 :"+map);
        System.out.println("Map 2:"+map2);

        System.out.println(map2.containsValue(9.6D));
        System.out.println(map.containsKey("my Name"));

        map.remove("my Name");
        //Duyệt kiểu dữ liệu map
        // get hết giá trị của Key và value
        for(Map.Entry<String ,String> entry :map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
