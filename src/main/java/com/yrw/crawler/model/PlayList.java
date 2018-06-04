package com.yrw.crawler.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

public class PlayList implements Serializable{
    //id
    private Long id;
    //歌单名字
    private String name;
    //歌单地址
    private String url;
    //歌单作者
    private String author;
    //歌单图片
    private String image;
    //播放次数
    private int playCount;
    //收藏数
    private int collectCount;

    private String introduction;

    private String tag;

    private List<Song> songs = new ArrayList<>();

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public int getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(int collectCount) {
        this.collectCount = collectCount;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTag(){return this.tag;}

    public List<Song> getSongs(){return this.songs;}

    public void setTag(String tag){
        this.tag=tag;
    }

    public void setSongs(List<Song> songs){
        this.songs = songs;
    }

    public void setIntroduction(String introduction){
        this.introduction=introduction;
    }

    public String getIntroduction(){
        return this.introduction;
    }
    @Override
	public String toString() {
		return "pl [id=" + id + ", name=" + name + ", url=" + url + ", author=" + author + ", image=" + image
				+ ", playCount=" + playCount + ", collectCount=" + collectCount + ", introduction=" + introduction
				+ ", tag=" + tag + ", songs=" + songs + "]";
	}
}
