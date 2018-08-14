package knowledge.designpattern.ResponChain;

public class HelloHandler extends Handler {
    @Override
    public void hander(String s) {
        System.out.println("hello"+s);
    }
}
