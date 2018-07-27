package jixiang;


import java.util.HashMap;
import java.util.Map;

class Point {
     int x;
     int y;
     Point() { x = 0; y = 0; }
     Point(int a, int b) { x = a; y = b; }
}

public class Solution {
    public int maxPoints(Point[] points) {

        int n=points.length;
        if(n<2){
            return n;
        }

        int ret=0;
        for(int i=0;i<n;i++){
            Map<Float,Integer> map=new HashMap<Float, Integer>();//必须放在这里不要放在for循环外
            int dup=1;
            int vtl=0;
            Point a=points[i];
            Integer integer=0;
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                Point b = points[j];
                int dx=a.x-b.x;
                int dy=a.y-b.y;
                if(dx==0){
                    if(dy==0){
                        dup++;
                    }else {
                        vtl++;
                    }
                }
                else {
                    float k=(float) dy/dx;
                    if(map.get(k) == null) {
                        map.put(k, 1);
                    }
                    else {
                        map.put(k, map.get(k) + 1);
                    }
                }
            }

            int max=vtl;
            for(Float k:map.keySet()){
                max=Math.max(max,map.get(k));
            }
            ret=Math.max(ret,max+dup);
        }
        return ret;
    }
}



