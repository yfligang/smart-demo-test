package com.liepin.www.demo01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//实现需求: 从网上下载多张图片，并将网上的图片保存在本地中
public class TestThread4 extends Thread {
    //定义下载图片的地址
    private String url;
    //定义保存图片的名称
    private String name;

    //需要将类WebDownload中方法download中的url和name传到main方法中,使用构造方法
    public TestThread4(String url,String name){
        this.url = url;
        this.name = name;
    }

    //然后重写Runnable接口中的run方法
    @Override
    public void run(){
        //实例化WebDownload类
        WebDownload webDownload = new WebDownload();
        //调用类中的下载方法
        webDownload.download(url,name);
        System.out.println("下载的图片的名称为 " + name);
    }

    //使用主方法来运行 start()方法
    public static void main(String[] args){
        //类的实例化,传入图片的地址+name
        TestThread4 testThread4 = new TestThread4("图片的地址","1.jpg");
        //然后使用Thread类来调用 .start()方法
        new Thread(testThread4).start();

    }
}

//实现将网上图片下载到本地的功能
class WebDownload01 {
    //创建一个方法来实现需求
    public void download(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
