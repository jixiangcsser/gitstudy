package jixiang;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListSet {
    public static void main(String[] args) {
        String[] strings={"jixiang","lilong","mayun","leijun"};
        //Array转换成List
        List<String> lists=Arrays.asList(strings);
        //List转为Array
        String[] listToString=lists.toArray(new String[lists.size()]);
        //List转为Set
        Set<String> stringSet= Sets.newHashSet(lists);
        //Set转为List
        List<String> setToList= Lists.newArrayList(stringSet);
        //List转为Map
        Map<String,String> stringMap= Maps.uniqueIndex(lists,new Function<String,String>(){
            public String apply(String s){
                return s;
            }
        });
        //Set转为Map
        Map<String,String> stringMap1=Maps.asMap(stringSet, new Function<String, String>() {
            public String apply(String s) {
                return s;
            }
        });
        for(String s:stringSet){
            System.out.print(s+" ");
        }
        System.out.println();
        for(String s:lists){
            System.out.print(s+" ");
        }
        System.out.println();
        for(String s:listToString){
            System.out.print(s+" ");
        }
        System.out.println();
        for(Map.Entry<String,String> entry:stringMap.entrySet()){
            System.out.print(entry.getKey()+" ");
        }
        System.out.println();
        stringSet.addAll(lists);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("ssss");
            e.printStackTrace();
        }
    }
}
