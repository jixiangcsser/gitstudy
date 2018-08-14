package jixiang.Util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 用于sqlSessionFactory生成的单例模式
 */
public class SqlSessionFactoryUtil {
    private volatile static SqlSessionFactory sqlSessionFactory;
    private static final Class CLASS_LOCK=SqlSessionFactoryUtil.class;
    private SqlSessionFactoryUtil(){}
    public static SqlSessionFactory initSqlSessionFactory(){
        String resource="mybatis-conf.xml";
        Reader reader=null;
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            Logger.getLogger(SqlSessionFactoryUtil.class.getName()).log(Level.SEVERE,null,e);
        }
        if(sqlSessionFactory==null){
            synchronized (CLASS_LOCK){
                if(sqlSessionFactory==null){
                    sqlSessionFactory= new SqlSessionFactoryBuilder().build(reader);
                }
            }
        }
        return sqlSessionFactory;
    }

    public static SqlSession openSqlSession(){
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.initSqlSessionFactory();
        return sqlSessionFactory.openSession();

    }

}
