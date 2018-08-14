package jixiang.study;

public class Teacher implements Person {
    private String name;
    public void zoulu() {
        System.out.println("这是个走路的实现");
    }

    public void chifan() {
        System.out.println("这是个吃饭的实现");
    }
    Teacher(String name){
        this.name=name;
    }
    public void jiaoShu(){
        System.out.println("教师名字="+name);
    }
}
