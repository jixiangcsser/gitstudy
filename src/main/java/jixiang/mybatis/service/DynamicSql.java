package jixiang.mybatis.service;

import com.google.common.collect.Lists;
import jixiang.Util.SqlSessionFactoryUtil;
import jixiang.mybatis.mapper.TableDaoMapper;
import jixiang.mybatis.mapper.TestDaoMapper1;
import jixiang.mybatis.model.Student;
import jixiang.study.Person;
import jixiang.study.Teacher;
import org.apache.ibatis.session.SqlSession;

import java.lang.instrument.Instrumentation;
import java.sql.Time;
import java.util.List;


/**
 * @author jixiang1
 */
public class DynamicSql  {
    private  static Instrumentation instrumentation;
    public static void main(String[] args) {
        /*SqlSession sqlSession=SqlSessionFactoryUtil.openSqlSession();
        TestDaoMapper1 testDaoMapper1 = sqlSession.getMapper(TestDaoMapper1.class);*/
       /* Student student=new Student(196668);
        student=testDaoMapper1.selcetIdByNameOrTelnum(student);
        System.out.println(student);*/
       /* Student student1=new Student(196668,199);

        *//*student1=testDaoMapper1.selcetIdByNameOrTelnum(student1);
        System.out.println(student1);*//*
        List<Student> students=testDaoMapper1.selectInfoByManyInfomation(student1);
        System.out.println(student1);
        testDaoMapper1.updateName(student1);*/
       /* List<Student> nameList= Lists.newArrayList();
        Student student =new Student(null,"jixiang");
        Student student1=new Student(null,"jixna");
        nameList.add(student);
        nameList.add(student1);
        testDaoMapper1.selectByNameList(nameList);*/
       /* List<Student> nameList= Lists.newArrayList();
        Student student=new Student(null,"ji");
        nameList=testDaoMapper1.lazzySelectList(student);
        sqlSession.commit();*/
        System.out.println(System.currentTimeMillis());
        List<Student> students=Lists.newArrayList();
        for(int i=0;i<10000;i++){
            Student student=new Student(10);
            students.add(student);
        }
        Student student=new Student(110);

        System.out.println(student);
        System.out.println(System.currentTimeMillis());
    }
}
