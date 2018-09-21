package knowledge;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import jixiang.study.Person;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;

import java.util.*;

public class ListReverse {
    List<String> list = new LinkedList<String>();
    HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();

    /* public ArrayList<String> wordBreak(String s, Set<String> dict) {
         ArrayList<String> arrayList=
     }*/
    /*public ArrayList<String>  dfs(String s,Set<String> dict,ArrayList<String> arrayList){
        if(arrayList.contains(s))
        if(s==""){
            return ;
        }
    }*/
    public static void main(String[] args) {
       /* List<Person> list= Lists.newArrayList();
        list.add(null);
        Map<String,String> map= Maps.newHashMap();
        MapUtils.isEmpty(map);
        if(CollectionUtils.isEmpty(list)){
            System.out.println("空");
            return;
        }else {
            for(Person p:list){
                p.zoulu();
            }
        }*/

        List<Long> longs = Lists.newArrayList();
        longs.add(3L);
        //test(1,longs);
        longs.add(5L);
        //test(2,longs);
        List<Long> myList = longs.subList(0 * 2, 1 * 2);
        System.out.println(myList.size());
        int i = 0;
        for (int k = 0; k < 5; k++) {
            if (i++ == 0) {
                System.out.println(k);
            }
        }
        Map<Integer, String> map = Maps.newHashMap();
        map.put(0, ":ssd");
        String s = map.get(0);
        if(s==null){
        }

    }

    public static void test(int size, List<Long> list) {
        final int num = size * list.size();
        System.out.println(num);
    }
}

