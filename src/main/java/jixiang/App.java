package jixiang;

/**
 * Hello world!
 *
 */
public class App 
{

        public static void main(String args[]) {
                float i=1.01f;
                double d=1.01;
                double j=(double) i;
                if(d==j){
                        System.out.println("deng");
                }else{
                        System.out.println("bu");
                }
                int k=0;
                k=k++;
                System.out.println(k);
                int w=0;
                w=++w;
                System.out.println(w);
        }

        public void run(){

        }
}
