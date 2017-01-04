package com.mobiletrain.newapp.model;

import com.mobiletrain.newapp.myinterface.Song;

/**
 * Created by idea on 2016/10/12.
 */
public class LocalMusic implements Song {

    long id; // 音乐id
    String title; // 音乐标题
    String artist; // 艺术家
    String album; // 专辑
    String displayName;
    long albumId;
    long duration; // 时长
    long size; // 文件大小
    String filePath; // 文件路径

    public LocalMusic(long id, String title, String artist, String album, String displayName, long albumId, long duration, long size, String filePath) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.displayName = displayName;
        this.albumId = albumId;
        this.duration = duration;
        this.size = size;
        this.filePath = filePath;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "LocalMusic{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", filePath='" + filePath + '\'' +
                '}';
    }

    @Override
    public String getIDownUrl() {
        return null;
    }

    @Override
    public boolean isIDownloaded() {
        return true;
    }

    @Override
    public String getIFilePath() {
        return getFilePath();
    }

    @Override
    public String getISongname() {
        return getTitle();
    }

    @Override
    public String getISingername() {
        return getArtist();
    }

    @Override
    public String getIAlbumpicSmall() {
        return null;
    }

    @Override
    public String getIAlbumpicBig() {
        return null;
    }

    @Override
    public int getISongId() {
        return 0;
    }

}
