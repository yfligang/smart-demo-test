package com.liepin.www.demo01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.net.URL;

//实现多线程同步下载图片
public class TestThread2 {

}

//下载器
class WebDownloader {
    //下载方法
    public void downloader(String url,String name) throws Exception{
        FileUtils.copyURLToFile(new URL(url), new File(name));
    }
}
