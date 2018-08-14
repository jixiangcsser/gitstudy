package work;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.SocketHandler;

public class Json {
    public static void main(String[] args) {
        String s="{\"itemList\":[{\"imgUrl\":\"http://haitao.nos.netease.com/cfvAhyL7flWRsk9I192-220%20-%20Tgvp%20t2KT1808021122_192_220.jpg\",\"linkUrl\":\"http://www.google.com\"},{\"imgUrl\":\"http://haitao.nos.netease.com/0PTtLTdD4A0pziG6192-220%20-%20IAHdT1808021123_192_220.jpg\",\"linkUrl\":\"https://www.kaola.com\"},{\"imgUrl\":\"http://haitao.nos.netease.com/NtT01X37p1ACO5tT192-220%20-%20LHhI%20o32T1808021123_192_220.jpg\",\"linkUrl\":\"http://www.jingdong.com\"},{\"imgUrl\":\"http://haitao.nos.netease.com/RbyDdOQRHfaXAoEB192-220T1808021123_192_220.jpg\",\"linkUrl\":\"http://www.tencent.com\"},{\"imgUrl\":\"http://haitao.nos.netease.com/LROm6zgdwxnD9RHp192-220%20-%20RNOWT1808021124_192_220.jpg\",\"linkUrl\":\"http://www.xinlang.com\"}]}";
        JSONObject jsonObjects=JSON.parseObject(s);
        JSONArray platforms = jsonObjects.getJSONArray("itemList");
       // JSONArray platforms1=JSON.parseArray(s);
        List<PictureVO> list=new LinkedList<PictureVO>();
        for(Object jsonObject:platforms){
            PictureVO pictureVO=JSONObject.parseObject(jsonObject.toString(),PictureVO.class);
            JSONObject jsonObject1=(JSONObject)jsonObject;
            String s1 = jsonObject1.getString("imgUrl");
            System.out.println(s1+"sss");
            list.add(pictureVO);
        }
        for(PictureVO pictureVO:list){
            System.out.println(pictureVO.getImgUrl());
            System.out.println(pictureVO.getLinkUrl());
        }
    }
}
