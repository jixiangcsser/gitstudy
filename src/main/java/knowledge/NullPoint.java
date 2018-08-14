package knowledge;

import com.google.common.collect.Maps;
import org.apache.commons.collections.MapUtils;


import java.util.Map;

public class NullPoint {
    public static void main(String[] args) {
        Map<String,String> maps= Maps.newHashMap();
        maps.put("jixiang","shuai");
        maps.put("mayun","youqian");
        String s=maps.get("ji");
        if(MapUtils.isNotEmpty(maps)){
            System.out.println("map不空");
        }
        Map<String,String> emptyMap=null;
        emptyMap.get("1");

        System.out.println(s);
    }
}
