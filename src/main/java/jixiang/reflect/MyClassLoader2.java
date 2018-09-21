package jixiang.reflect;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

public class MyClassLoader2 extends MyClassLoader {

    MyClassLoader2(ClassLoader classLoader){
        super(classLoader);
    }

    public static void main(String[] args) {
        MyClassLoader2 myClassLoader = new MyClassLoader2(LinkedList.class.getClassLoader());
        System.out.println(myClassLoader.getParent());
    }
}
