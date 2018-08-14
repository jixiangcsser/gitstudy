package knowledge.designpattern.ResponChain;

abstract public class Handler {
    private Handler handler;

    public void setNexthandler(Handler handler){
        this.handler = handler;
    }

    public Handler() {
    }

    public void doHander(String s){
        hander(s);
        if (handler != null){
            handler.doHander(s);
        }
    }
    abstract protected void hander(String s);




}
