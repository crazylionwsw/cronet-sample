package com.example.firstdemo.ui.main;


import java.util.Calendar;

/**
 * 上传文件信息
 */
public class UploadFile {

    /**
     * 文件路径
     */
    public String fileUrl = null;

    /**
     * 上传完成与否
     */
    public Boolean uploadFinish = false;

    /**
     * 开始上传时间戳
     */
    public Long startUploadTime = System.currentTimeMillis();

    /**
     * 上传结束时间戳
     */
    public Long endUploadTime = null;

    /**
     * 检测缺陷是否存在
     */
    public Boolean hasBug = false;
}
