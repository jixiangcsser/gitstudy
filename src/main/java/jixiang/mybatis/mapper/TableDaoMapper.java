package jixiang.mybatis.mapper;

import jixiang.mybatis.model.Student;
import jixiang.mybatis.model.StudentVO;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface TableDaoMapper {
    int insertValue();
    int insertValueWithObject(Student student);
    List<Student> selectName(String name);
    int selectMayunCount(String name);
    List<Student> selectFuzzybyIdAndName(Student student);
    int insertMoney(Student student);
    Student getMoney(Integer id);
    BigDecimal getTest(@Param("id") Integer id,@Param("name") String name);
    int insertStudentBySex(StudentVO studentVO);


}
