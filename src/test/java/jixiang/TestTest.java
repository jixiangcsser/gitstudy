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
        System.out.println("Master分支上的修改1 master11:50");
    }
    public void mergeMaster2(){
        System.out.println("Master分支上的修改2 master11:55");
    }
}