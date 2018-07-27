package jixiang;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

public class ListTransform {
    public static PersonVo personDbToVo(PersonDb personDb) {
        Preconditions.checkNotNull(personDb, "[PersonDbToVo]personDb为null");
        PersonVo personVo = new PersonVo();
        personVo.setName(personDb.getName() + ",from Db");
        personVo.setAge(personDb.getAge());
        personVo.setMsg(personDb.getMsg());
        return personVo;
    }

    public static void main(String[] args) {
        List<PersonDb> personDbs= Lists.newArrayList(
                new PersonDb("zhangsan",20),
                new PersonDb("wangwu",23),
                new PersonDb("lisi",25)

        );
        List<PersonVo> peronVos=Lists.transform(personDbs, new Function<PersonDb, PersonVo>() {
            public PersonVo apply(PersonDb personDb) {
                return personDbToVo(personDb);
            }
        });
        for(PersonVo personVo:peronVos){
            System.out.println(personVo.getAge());
        }
        String s="jixiang jia you";
        String[] strings= s.split(" ");
        List<String> strings1= Arrays.asList(strings);
        List<Character> characters= Lists.charactersOf(s);
        List<Character> characters1= ((ImmutableList<Character>) characters).reverse();
        for(String s1:strings1){
            System.out.println(s1);
        }
        for(Character character:characters1){
            if(Character.isDigit(character)){
                System.out.println("数字");
            }else {
                System.out.println(character);
            }

        }

    }



}
class PersonDb{
    private String name;
    private int age;
    private String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public PersonDb(String name, int age) {
        this.name = name;
        this.age = age;

    }
}
class PersonVo {
    private String name;
    private int age;
    private String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
       return "VO";
    }
}
