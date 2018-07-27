package jixiang;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Set;

public class SetsUse {
    public static void main(String[] args) {
        Set<String> set1= Sets.newHashSet("chen","lei","java");
        Set<String> set2=Sets.newHashSet("chen","lei","hadoop");
        Sets.SetView<String>diffSetHandle=Sets.difference(set1,set2);
        Set<String> diffImmutable=diffSetHandle.immutableCopy();
        Iterator iterator=diffSetHandle.iterator();
        while (iterator.hasNext()){
            System.out.println("Set的不同元素："+iterator.next().toString());
        }


        Sets.SetView<String> commonSet=Sets.intersection(set1,set2);
        Set<String> commonImmutable=commonSet.immutableCopy();
        Iterator iterator1=commonSet.iterator();
        System.out.print("相同的元素有");
        while (iterator1.hasNext()){
            System.out.print(iterator1.next().toString()+" ");
        }
        Object o=null;
        Object o1=null;
        if(Objects.equal(o,o1)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
