package jixiang;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class MockItoTest {

    static int sum=1;
    int single=2;
    static int n=0;
    @Test(expected = FileNotFoundException.class)
    public void run() throws  FileNotFoundException {
        sum++;
        System.out.println("sum="+sum);
        new FileInputStream("/jixaleg");
    }
    @Test
    public void run2(){
        sum++;
        System.out.println("sum="+sum);
        assertEquals(5,5*1);
    }

    @Ignore
    public void run3(){
        sum++;
        System.out.println(sum);
        System.out.println("你好");
        assertEquals(5,5*1);
    }

    /**
     * 如果测试超过100秒就报异常
     */
    @Test(timeout = 100)
    public void run4(){
        while(true){}
    }
    /**
     * 任何测试方法执行前都执行一次,其实应该是多个线程执行。
     */
    @Before
    public void before1(){
        single++;
        n++;
        System.out.println("single = "+single);
    }
    @After
    public void after1(){
        System.out.println("@After释放资源执行多次：这是第"+n+"次");
    }
    /**
     * 这个方法只执行一次，在所有方法执行前执行,并且必须是静态的方法
     */
    @BeforeClass
    public static void before2(){
        sum++;
    }
    @AfterClass
    public static void after2(){
        System.out.println("AfterClass注解的释放资源只执行一次");
    }


    public void addRebaseTest(){
        System.out.println("测试rebase");
    }

}
