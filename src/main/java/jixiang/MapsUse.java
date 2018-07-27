package jixiang;

import com.google.common.collect.Lists;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

public class MapsUse {
    public static void main(String[] args) {
        Map<String,Integer> map1= Maps.newHashMap();
        Map<String,Integer> map2= Maps.newHashMap();
        map1.put("jiang",12);
        map1.put("layang",15);
        map1.put("xioayun",123);

        map2.put("guyan",20);
        map2.put("layang",15);
        map2.put("xioayun",123);
        MapDifference<String,Integer> difference=Maps.difference(map1,map2);
        Map<String,Integer> commonMap=difference.entriesInCommon();
        Map<String,Integer> diffOnLeft=difference.entriesOnlyOnLeft();
        Map<String,Integer> diffOnRight=difference.entriesOnlyOnRight();
        List<String> diffALL= Lists.newArrayList();
        for(Map.Entry<String,Integer> entry:commonMap.entrySet()){
            System.out.println("相同的Map的key值为："+entry.getKey());
        }
        for(Map.Entry<String,Integer> entry:diffOnLeft.entrySet()){
            diffALL.add(entry.getKey());
            System.out.println("左边相对于 他们共同的集合的 不同之处"+entry.getKey());
        }

        for(Map.Entry<String,Integer> entry:diffOnRight.entrySet()){
            diffALL.add(entry.getKey());
            System.out.println("右边相对于 他们共同的集合的 不同之处"+entry.getKey());
        }

        System.out.println("两个Map中不同之处"+diffALL.toString());


    }
}
