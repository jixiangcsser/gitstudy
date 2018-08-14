package jixiang.service;

import jixiang.Util.SqlSessionFactoryUtil;
import jixiang.mybatis.mapper.TableDaoMapper;
import jixiang.mybatis.model.Student;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;

@Slf4j
public class SqlSession {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory=SqlSessionFactoryUtil.initSqlSessionFactory();
        org.apache.ibatis.session.SqlSession sqlSession=sqlSessionFactory.openSession();
        TableDaoMapper tableDaoMapper= sqlSession.getMapper(TableDaoMapper.class);
        Student student=tableDaoMapper.getMoney(19666);
        log.info("使用了同一个sqlSession再执行一次");
        Student student2=tableDaoMapper.getMoney(19666);
        sqlSession.commit();
        org.apache.ibatis.session.SqlSession sqlSession2=sqlSessionFactory.openSession();
        TableDaoMapper tableDaoMappe1r= sqlSession.getMapper(TableDaoMapper.class);
        Student student3=tableDaoMapper.getMoney(19666);
        sqlSession.commit();
    }
}
