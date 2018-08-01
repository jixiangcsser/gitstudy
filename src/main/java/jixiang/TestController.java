package jixiang;


public class TestController {

    public static void main(String[] args) {
        LogUse logUse=new LogUse();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        NullPointerException nullPointerException=new NullPointerException();
        System.out.println("哦不行");
         logUse.doSomthing1();
        System.out.println("我想");
    }

}