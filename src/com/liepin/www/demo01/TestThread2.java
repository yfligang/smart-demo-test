package com.liepin.www.demo01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//实现多线程同步下载图片
public class TestThread2 extends Thread{

    private String url; //网络图片地址
    private String name; //保存的文件名

    //带参构造方法
    public TestThread2(String url,String name){
        this.url = url;
        this.name = name;
    }

    //准备重写run方法,下载图片线程的执行体
    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载了文件名为 " + name);
    }

    public static void main(String[] args){
        //实例化本类
        TestThread2 tt1 = new TestThread2("https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png","1.png");
        TestThread2 tt2 = new TestThread2("https://b.bdstatic.com/searchbox/icms/searchbox/img/blue-v.png","2.png");
        TestThread2 tt3 = new TestThread2("https://dss1.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/weather/icons/a7.png","3.png");

        tt1.start();
        tt2.start();
        tt3.start();

    }
}

//下载器
class WebDownloader {
    //下载方法
    public void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，download方法出现问题");
        }
    }
}
