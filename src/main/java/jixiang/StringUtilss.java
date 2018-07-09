package jixiang;

import org.apache.commons.lang3.StringUtils;

public class StringUtilss {
    public static void main(String[] args) {
        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isBlank(null));
        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isBlank(""));
        System.out.println(StringUtils.isEmpty(" "));
        System.out.println(StringUtils.isBlank(" "));
        System.out.println(StringUtils.isEmpty("1"));
        System.out.println(StringUtils.isBlank("1"));

    }

}
