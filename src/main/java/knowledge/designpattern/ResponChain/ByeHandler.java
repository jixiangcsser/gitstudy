package knowledge.designpattern.ResponChain;

public class ByeHandler extends Handler {

    @Override
    public void hander(String s) {
        System.out.println("Bye"+s);
    }
}
