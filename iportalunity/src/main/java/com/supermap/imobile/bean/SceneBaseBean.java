package com.supermap.imobile.bean;

import com.supermap.iportalservices.IPortalService;

public class SceneBaseBean {

    private String title;
    private String thumbnail; //缩略图路径。
    private int count; //访问次数
    private long updateTime;
    private long createTime;
    private String description;
    int ID = -1;

    public SceneBaseBean(Builder builder) {
        this.ID = builder.ID;
        this.title = builder.title;
        this.thumbnail = builder.thumbnail;
        this.count = builder.count;
        this.updateTime = builder.updateTime;
        this.createTime = builder.createTime;
        this.description = builder.description;
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public int getCount() {
        return count;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public long getCreateTime() {
        return createTime;
    }

    public String getDescription() {
        return description;
    }

    public String getURL() {
        return "http://" + IPortalService.getInstance().getIPortalServiceHost() + "/web/scenes/"+ ID;
    }

    public static class Builder {
        private String title;
        private String thumbnail; //地图的缩略图路径。
        private int count; //访问次数
        private long updateTime;
        private long createTime;
        private String description;
        private int ID = -1;

        public Builder(String title, int ID, String thumbnail) {
            this.title = title;
            this.ID = ID;
            this.thumbnail = thumbnail;
        }

        public Builder setCount(int count){
            this.count = count;
            return this;
        }

        public Builder setupdateTime(long updateTime){
            this.updateTime = updateTime;
            return this;
        }

        public Builder setcreateTime(long createTime){
            this.createTime = createTime;
            return this;
        }

        public Builder setdescription(String description){
            this.description = description;
            return this;
        }

        //构造器入口
        public SceneBaseBean build() {
            return new SceneBaseBean(this);
        }
    }

}
