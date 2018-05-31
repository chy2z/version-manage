package com.github;

/**
* @Title: App
* @Description: master 版本
* @author chy
* @date 2018/5/31 10:33
*/
public class App 
{
    /**
     * 版本号
     */
    public static String version="1.5.1";

    /**
     * 开发中版本
     */
    public static String appName="develop";

    public static void main( String[] args )
    {
        if(appName.equals("develop")) {
            System.out.println("develop version:" + version);
        }
        else{
            System.out.println("master version:" + version);
        }
    }
}
