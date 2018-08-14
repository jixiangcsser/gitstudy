package jixiang.study;

import java.util.LinkedList;
import java.util.List;

public class TestFanXing {
    public static void main(String[] args) {
        List<Person> teachers = new LinkedList<Person>();
        Teacher teacher = new Teacher("jxiiang");
        teachers.add(teacher);
        teacher.jiaoShu();
       // teachers.get(0).
    }
}
