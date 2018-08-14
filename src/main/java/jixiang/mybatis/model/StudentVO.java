package jixiang.mybatis.model;

import java.io.Serializable;

/**
 * @author jixiang1
 */
public class StudentVO implements Serializable {
    private static final long serialVersionUID = 8197865603265751000L;
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
