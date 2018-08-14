package jixiang.mybatis.mapper;

import jixiang.mybatis.model.Student;

import java.util.List;

/**
 * @author jixiang1
 */
public interface TestDaoMapper1 {
    Student selcetIdByNameOrTelnum(Student student);
    List<Student> selectInfoByManyInfomation(Student student);
    int updateName(Student student);
    List<Student> selectByNameList (List<Student> nameList);
    List<Student> lazzySelectList (Student student);
}
