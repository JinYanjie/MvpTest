package com.jupin.mymvp_rxj_retrofit.joke.model;

/**
 * Created by jyj on 2017/3/6.
 */
public class JokeBean {
    /**{
        "content": "一个人发贴：刚和哥哥打架了，他在客厅里，我在厨房里，厨房有刀，我要怎么办？　　雷人回复：削个苹果给哥哥吃，告诉他别生气了！",
            "hashId": "712b624f10440d1ab94b9815d3a5b1a2",
            "unixtime": 1488757430,
            "updatetime": "2017-03-06 07:43:50"
    }
     */
    public String content;
    public String hashId;
    public long unixtime;
    public String updatetime;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHashId() {
        return hashId;
    }

    public void setHashId(String hashId) {
        this.hashId = hashId;
    }

    public long getUnixtime() {
        return unixtime;
    }

    public void setUnixtime(long unixtime) {
        this.unixtime = unixtime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }
}
