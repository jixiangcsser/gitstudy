package jixiang;

import com.google.common.collect.Lists;

import javax.xml.stream.events.Characters;
import java.io.*;
import java.util.List;

public class UUID {
    public static void main(String[] args) {
//        for(int i=0;i<6;i++) {
//            String uid = java.util.UUID.randomUUID().toString();
//            StringBuffer stringBuffer = new StringBuffer();
//            String[] strings = uid.split("-");
//            for (String s : strings) {
//                stringBuffer.append(s);
//            }
//
//            System.out.println(stringBuffer.toString());
//
//        }
        String file="D:/stream.txt";
        String charset="UTF-8";
        OutputStreamWriter outputStreamWriter=null;
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(file);
            outputStreamWriter=new OutputStreamWriter(fileOutputStream,charset);
            outputStreamWriter.write("这是要保存的中文字符");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStreamWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        InputStreamReader inputStreamReader=null;
        try {
            FileInputStream fileInputStream=new FileInputStream(file);
            inputStreamReader=new InputStreamReader(fileInputStream,charset);
            char[] buf=new char[64];
            StringBuffer buffer=new StringBuffer();
            int count =0;
            while((count=inputStreamReader.read(buf))!=-1){
                buffer.append(buf,0,count);
            }
            System.out.println(buffer.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String s="呵呵哈哈哈";
        try {
            byte[] b=s.getBytes("GBK");
            String n=new String(b,"UTF-8");

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        List<Character> list = Lists.charactersOf(s);
        for(Character character:list){
            System.out.println(character);
        }
    }
}
