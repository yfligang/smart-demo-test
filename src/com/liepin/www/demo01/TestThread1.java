package com.liepin.www.demo01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.net.URL;

//执行线程需要调用runnable接口实现类
public class TestThread1 implements Runnable {

    private String url;
    private String name;

    //创建一个带参构造函数来传递成员变量
    public TestThread1(String url,String name){
        this.url = url;
        this.name = name;
    }

    //调用WebDownload类中的download方法
    @Override
    public void run(){
        //先实例化类WebDownload
        WebDownload webDownload = new WebDownload();
        webDownload.download(url,name);
        System.out.println("下载的图片为 " + name);
    }

    public static void main(String[] args){
        TestThread1 tt1 = new TestThread1("https://www.baidu.com/img/PCtm_d9c8750bed0b3c7d089fa7d55720d6cf.png","1.png");
        TestThread1 tt2 = new TestThread1("https://b.bdstatic.com/searchbox/icms/searchbox/img/blue-v.png","2.png");
        TestThread1 tt3 = new TestThread1("https://dss1.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/weather/icons/a7.png","3.png");

//        Thread t1 = new Thread(tt1);
//        t1.start();
        Thread t2 = new Thread(tt2);
        t2.start();
        Thread t3 = new Thread(new TestThread1("https://dss1.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/weather/icons/a7.png","3.png"));
        t3.start();

        //上面的代码可以简化为
        new Thread(tt1).start();
    }

}
//下载图片
class WebDownload {
    //创建一个方法，下载网上图片然后存储到本地
    public void download(String url,String name){
        try{
            FileUtils.copyURLToFile(new URL(url),new File(name));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
