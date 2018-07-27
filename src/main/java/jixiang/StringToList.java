package jixiang;



import com.google.common.collect.Maps;


import java.util.*;

public class StringToList {
    public static void main(String[] args) {
//        String[] strings={"jixiang","mayun","dinglei"};
//        List<String> list=new LinkedList<String>();
//        list =Arrays.asList(strings);
//
//        String[] listToString;
//        listToString=list.toArray(new String[list.size()]);
//        StringBuffer s1=new StringBuffer();
//
//        for(String s:listToString){
//            if(s1.length()==0){
//                s1.append(s);
//            }
//            else {
//                s1.append(',').append(s);
//            }
//
//        }
//        System.out.println(s1);
//        Long[] longs={1L,2L,3L,4L};
        String s11=",";
        String[] strings=s11.split(",");
        List<String> lists=Arrays.asList(strings);
        if(lists==null){
            System.out.println("sdsdsd");
        }else {
            System.out.println("sd");
        }
        List<String> strings1=new ArrayList<String>();
        for(String s:lists){
            System.out.println(s);
            System.out.println("ss");
            strings1.add(s);
        }

//        for(int i=0;i<s11.length();i++){
//            if(!Character.isDigit(s11.charAt(i))&&s11.charAt(i)!=','){
//                System.out.println("error");
//            }
//
//
//        }
//        System.out.println("true");


    }
}
