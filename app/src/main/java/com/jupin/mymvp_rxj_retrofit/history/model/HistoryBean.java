package com.jupin.mymvp_rxj_retrofit.history.model;

/**
 * Created by jyj on 2017/3/6.
 */
public class HistoryBean {

    /**{
        "_id": "11201101",
            "title": "北宋江南方腊起义",
            "pic": "http://juheimg.oss-cn-hangzhou.aliyuncs.com/toh/201109/18/7D2278978.jpg",
            "year": 1120,
            "month": 11,
            "day": 1,
            "des": "在897年前的今天，1120年11月1日 (农历十月初九)，北宋江南方腊起义。",
            "lunar": "庚子年十月初九"
    }
     */


    private String id;
    private String title;
    private String pic;
    private int year;
    private int month;
    private int day;
    private String des;
    private String lunar;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getLunar() {
        return lunar;
    }

    public void setLunar(String lunar) {
        this.lunar = lunar;
    }
}
