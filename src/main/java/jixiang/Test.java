package jixiang;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mchange.v2.collection.MapEntry;
import jixiang.mybatis.model.Student;
import org.apache.commons.collections.CollectionUtils;
import org.thymeleaf.util.StringUtils;
import work.collectionUtil.CollectionUtil;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void run() {
        System.out.println("jjj");
    }

    public void gitadd() {
        System.out.println("我想说呢");
    }

    public void gitadd2() {
        System.out.println("我想说呢");
    }

    public static void add() {
        System.out.println("XXX");
    }

    public static void oo() {
        System.out.println("OOOOO");
    }
    public static void main(String[] args) {

  /*  HashMap<String,String> hashMap=new HashMap<String, String>();
    hashMap.put("1","这是1");
    hashMap.put("2","这是2");
    hashMap.put("3","这是3");
      System.out.println(hashMap.values());
      for(Map.Entry<String,String> entry:hashMap.entrySet()){
          ArrayList<String> arrayList=new ArrayList<String>();
      }
      int[] i={1,2,3};

      System.out.println(i.getClass().getName());
      try {
          Class<?> intClass=Class.forName("[I");

          System.out.println(intClass.getName());
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }
      int kl=4;*/
        List<Long> brandIdList = Arrays.asList(1452L, 6307L, 1389L, 1566L, 7001L, 1200L, 1447L, 3230L, 1838L, 2899L, 1193L, 2100L, 2495L, 1031L, 1218L, 1106L, 1534L, 2444L, 2195L);
       /* System.out.println(brandIdList);
        Long[] longs = {1L, 2L, 3L};

        ArrayList<Long> arrayList = Lists.newArrayList();

        List<Long> list = Arrays.asList(longs);
        System.out.println(list);
        Long[] longs11 = (Long[]) list.toArray();
        for (Long l : longs11) {
            System.out.println(l);
        }
        List<Long> subList=list.subList(0,0);
        if(subList!=null){
            System.out.println("不空");
        }
        Long old = list.set(1, 5L);
        System.out.println("old="+old);*/
       /* List<Long> list1 = MockBIData.generateBrandIdListByCateId();
        if (CollectionUtils.isEmpty(list1)) {
            System.out.println("空");
        } else {
            System.out.println("不空");
        }*/
     /* TT tt=new TT("jxiang");

      System.out.println(tt);
      System.out.println(tt);*/
        //String s="姬***y@1刚刚.com刚刚下了单";
        String s="j***9刚刚下了单";
        //System.out.println(s.length());
       // System.out.println((301+30-1)/30);
        //String s="jix刚刚下了单";
        System.out.println(desensitization(s));
        /*CollectionUtil.split(300, 30, new CollectionUtil.PageProcessByNum() {
            @Override
            public void process(int requestSize) {
                System.out.println(requestSize);
            }
        });
        CollectionUtil.split(brandIdList, 2, new CollectionUtil.PageProcess<Long>() {
            @Override
            public void process(List<Long> brandIdList) {
                System.out.println(brandIdList);
            }
        });*/


        final List<String> lists=Lists.newArrayList();
        lists.add("niha1");
        lists.add("str");
        String s1=new String("ss");
        char[] s2="".toCharArray();
        if(StringUtils.isEmpty(s1)){
            System.out.println("龙");
        }
        StringBuilder buffer=new StringBuilder();
       /* for(int i=0;i<10000;i++){
            lists.add("sdfsaf4"+i);
        }*/
        final Iterator<String> iterator=lists.iterator();
        List<String> lists1=Lists.newArrayList(lists);
        System.out.println(lists1);
       /* Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                while (iterator.hasNext()){
                    String st=iterator.next();

                    iterator.remove();
                    System.out.println(st+Thread.currentThread().getName());
                }
            }
        });*/
        char[] chars={'1','2','r','3'};
        String s3=new String(chars,1,2);
        System.out.println(s3);
        int[] ints={52,53,54,55};
        char s0='0'+1;
        System.out.println(s0);
        System.out.println((char) 52);
        String s4=new String(ints,0,4);
        System.out.println(s4);
        /*thread2.start();*/
        /*int[] i={1,2,3};
        for(int w:i){
            System.out.println(i);
        }*/
        /*Object[] objects={1,2,3,4,5,null,null};
        System.out.println(objects.length);*/

    }

    public static String desensitization(String nickName) {
        if(nickName.length()<=10){
            return nickName;
        }
        char[] chars = nickName.toCharArray();
        System.arraycopy(chars, chars.length-5, chars, 5, 5);
        char[] resultChars=Arrays.copyOfRange(chars,0,10);
        StringBuilder stringBuilder=new StringBuilder();
        resultChars[1]='*';
        resultChars[2]='*';
        resultChars[3]='*';
        String s=new String(resultChars);
        return s;
    }

    public static void lll() {


        System.out.println("SSSSSS");
        System.out.println("这是Testbranch的第一次提交");
        System.out.println("LLLLLL");

    }

}

class MyThread extends Thread {
    @Override
    public void run() {
//此处不直接调用实例方法getName()来获取线程名，原因请看下文
        System.out.println("Current thread --- " + Thread.currentThread().getName());
    }
}

class TT {
    private String name;

    public TT(String name) {
        this.name = name;
    }

    /**
     * 测试debug查看对象时是否被调用
     */
    @Override
    public String toString() {
        System.out.println("输出了...");
        return super.toString();
    }
}
