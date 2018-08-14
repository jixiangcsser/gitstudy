package jixiang.service;

import jixiang.Util.SqlSessionFactoryUtil;
import jixiang.mybatis.mapper.TableDaoMapper;
import jixiang.mybatis.model.StudentVO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class insertData {
    public static void main(String[] args) {

            SqlSession session =null;
            try{
                //下面这个方法最好封装个单例模式！
                SqlSessionFactory sqlMapper = SqlSessionFactoryUtil.initSqlSessionFactory();
                session=sqlMapper.openSession();
//            for(int i=9300;i<18000;i++) {
//               int j=session.insert("insertValue",i);
//                System.out.println(j);
//            }
                /*BigDecimal bigDecimal=new BigDecimal(19.3);
               Student student=new Student(196667,null,"jixiang",29,bigDecimal);*/

                TableDaoMapper tableDaoMapper=session.getMapper(TableDaoMapper.class);

              /*  int j=tableDaoMapper.insertValueWithObject(student);
                System.out.println(j);
                System.out.println(student.getUserId());*/
                /*List<Student> students= Lists.newArrayList();

                students=tableDaoMapper.selectName("mayun");
                int count=0;
                for(Student student1:students){
                    System.out.println(student1);
                    count++;
                }
                System.out.println(count);*/
             /*   String name="mayun";
                int count =tableDaoMapper.selectMayunCount(name);
                System.out.println(count);

                Student student1=new Student();
                student1.setName("ji");
                student1.setAge(2);
                List<Student> list=tableDaoMapper.selectFuzzybyIdAndName(student1);*/
//                Student student2=new Student();
//                student2.setAge(26);
//                student2.setName("canghai");
//                student2.setTelnum("135465468789");
//                BigDecimal bigDecimal=new BigDecimal(1000000.08980);
//                student2.setMoney(bigDecimal);
//                System.out.println(bigDecimal);
//                int w=tableDaoMapper.insertMoney(student2);
               // BigDecimal bigDecimal=new BigDecimal(121313.34);
                /*Student student1=new Student(12,null,null,null,null);
                student1=tableDaoMapper.getMoney(196666);*/
               /* System.out.println(student1);*/
                /*StudentVO studentVO=new StudentVO();
                studentVO.setSex("female");
                int i=tableDaoMapper.insertStudentBySex(studentVO);
                System.out.println(i);*/

                session.commit();
            }catch (Exception ex){
                System.out.println(ex);
                session.rollback();
            }finally {
                session.close();
            }


            System.out.println("成功");
        }


}
