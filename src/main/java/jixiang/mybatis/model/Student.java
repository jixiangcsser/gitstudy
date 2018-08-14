package jixiang.mybatis.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Student implements Serializable {
    public Student(Integer userId,String name,String telnum,Integer age,BigDecimal bigDecimal,Integer width,Integer length){
        this.userId=userId;
        this.myName=name;
        this.telnum=telnum;
        this.myage=age;
        this.money=bigDecimal;
        this.length=length;
        this.width=width;
    }
    public Student(Integer userId){
        this.userId=userId;
    }
    public Student(Integer userId,Integer width){
        this.userId=userId;
        this.width=width;
    }
    public Student(Integer userId,String name){
        this.userId=userId;
        this.myName=name;
    }
    /*public Student(){

    }*/
    private Integer userId;
    private String myName;
    private String telnum;
    private Integer myage;
    private BigDecimal money;
    private Integer width;
    private Integer length;

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getTelnum() {
        return telnum;
    }

    public void setTelnum(String telnum) {
        this.telnum = telnum;
    }

    public Integer getMyage() {
        return myage;
    }

    public void setMyage(Integer myage) {
        this.myage = myage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "userId=" + userId +
                ", myName='" + myName + '\'' +
                ", telnum='" + telnum + '\'' +
                ", myage=" + myage +
                ", money=" + money +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    //  private
}
