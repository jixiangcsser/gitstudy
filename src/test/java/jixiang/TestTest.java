package jixiang;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTest {

    @Test
    public void run() {
        Assert.assertTrue(true);
    }

    public void testRebase(){
        System.out.println("这是个rebase");
    }
    public void testRebase2(){
        System.out.println("这是个rebase2");
    }
    public void mergeJixiang(){
        System.out.println("Master分支上的修改1 jixiang11:51");


    }
    public void mergeMaster1(){

        System.out.println("Jixiang分支上的修改1 jixiang13:55  111");

    }
    public void mergeMaster2(){
        System.out.println("Jixiang分支上的修改2 Jixiang13:55  2222");
    }
    public void mergeMaster3(){
        System.out.println("Jixiang分支上的修改2 Jixiang13:55  2223333");
    }
    public void mergeMaster4(){


        System.out.println("这是master的第9次修改!!,就是要写改");
    }

    public void mergeMaster5(){
        System.out.println("这是master的第10次修改,就是要修改!!,");


    }
    public void jixiang1(){
        System.out.println("姬祥第二次提交内容");
    }
}