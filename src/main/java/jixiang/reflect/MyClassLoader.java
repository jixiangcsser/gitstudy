package jixiang.reflect;

import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyClassLoader extends ClassLoader {

//    private
    MyClassLoader (ClassLoader classLoader) {
        super( classLoader);
    }

    MyClassLoader(){

    }
public static void main(String[] args) {
//        new MyClassLoader()

//    System.out.println(Arrays.class.getClassLoader().getParent());
    System.out.println(RequestMapping.class.getClassLoader().getParent());
}
}

