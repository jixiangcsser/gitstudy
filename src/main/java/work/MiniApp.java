package work;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MiniApp {
    public static void main(String[] args) {
        Category category=new Category();
        Gooods goods=new Gooods();
        goods.setName("姬祥");
        goods.setPrice(1000000000L);
        category.setGooods(goods);


        System.out.println(category.getGooods().getName());
        String s="\"将信息\"";
        System.out.println(s);
        String str=s.replace("\"","");
        System.out.println(str);
    }
}
