package jixiang;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test {
  public static void run(){
      System.out.println("jjj");
  }

  public void gitadd(){
      System.out.println("我想说呢");
  }
    public void gitadd2(){
        System.out.println("我想说呢");
    }

  public static void add(){
      System.out.println("XXX");
  }
  public static void oo(){
      System.out.println("OOOOO");
  }

  public static void main(String[] args){
//        Test.run();
//        String[] lists={"mayun","lilong","wangjun"};
//      System.out.println(lists.length);
//      System.out.println(lists.length);
//      System.out.println(lists[0].length());
//      System.out.println(lists[1].length());
//      List<Integer> list=new LinkedList<Integer>();
//      list.add(2);
//      list.add(3);
//      list.add(4);
//      list.add(4);
//      System.out.println(list.size());
//      Boolean flag=null;
//      System.out.println(Boolean.FALSE.equals(flag));
//      App app=new App();
//      System.out.println(App.class.getResource("/"));

      Calendar calendar=Calendar.getInstance();
      calendar.setTime(new Date());
      System.out.println("现在的时间是："+new Date());
      String year =String.valueOf(calendar.get(Calendar.YEAR));
      String month=String.valueOf(calendar.get(Calendar.MONTH)+1);
      String day=String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
      String week=String.valueOf(calendar.get(Calendar.DAY_OF_WEEK)-1);
      System.out.println("现在时间是："+year+"年"+month+"月"+day+"日，星期"+week);



  }
  public static void lll(){


      System.out.println("SSSSSS");
      System.out.println("MMMMMM");
      System.out.println("LLLLLL");

  }
}

