package knowledge.designpattern.ResponChain;

public class Test {
    public static void main(String[] args) {
        String s = "jixinag";
        Handler handler = new ByeHandler();
        handler.setNexthandler(new HelloHandler());
        handler.doHander(s);
    }
}
