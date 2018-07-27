package jixiang;

public class runtest {
    public static void main(String[] args) {
        testException te=new testException();
        try {
            te.method1();
        } catch (CException e) {
            e.printStackTrace();
        }

    }
}

class testException
{
    public void method1() throws CException
    {
        throw new CException("Test Exception");
    }


    public void method2(String msg)
    {
        if(msg == null)
        {
            throw new NullPointerException("Message is null");
        }
    }


    public void method3() throws CException
    {
        method1();
    }


// 以下省略
// ...
}
class CException extends Exception
{
    public CException() {}
    public CException(String message)
    {
        super(message);
    }
}