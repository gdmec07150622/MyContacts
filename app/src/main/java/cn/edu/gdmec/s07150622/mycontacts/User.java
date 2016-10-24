package cn.edu.gdmec.s07150622.mycontacts;

/**
 * Created by admin on 2016/10/18.
 */
public class User {
    //字段名常量
    public final static String NAME = "name";
    public final static String MOBILE = "mobile";
    public final static String DANWEI = "danwei";
    public static final  String QQ = "qq";
    public static final String ADDRESS = "address";

    //类属性
    private String name;
    private String mobile;
    private String danwei;
    private String qq;
    private String address;
    private int id_DB = -1;

    //getter setter 方法

    public String getAddress() {
        return address;
    }

    public String getDanwei() {
        return danwei;
    }

    public int getId_DB() {
        return id_DB;
    }

    public String getMobile() {
        return mobile;
    }

    public String getName() {
        return name;
    }

    public String getQq() {
        return qq;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei;
    }

    public void setId_DB(int id_DB) {
        this.id_DB = id_DB;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }
}
