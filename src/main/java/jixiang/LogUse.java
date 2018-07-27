package jixiang;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@Slf4j

public class LogUse {
    private static final org.slf4j.Logger logger= LoggerFactory.getLogger(LogUse.class);
    public static void main(String[] args) {
        String s="ssss";
        logger.debug("debug message");
        logger.warn("warn message");
        logger.info("info message");
        logger.error("error message");
        logger.trace("trace message");
        log.debug("debug message");
        log.warn("warn message");
        log.info("info message");
        log.error("error message");
        log.trace("trace message");
        log.info("测试有一下传入参数{}",s);
        LogUse logUse=new LogUse();
        try{
            logUse.doSomthing();
        }catch (Exception e){
            log.error("出现IO错误:{}",e);

        }

    }
    public void doSomthing() throws IOException{
        System.out.println("do something");
        IOException ioException=new IOException();
        throw ioException;
    }
    public void doSomthing1(){
        System.out.println("do something11122");
    }

}
