package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.NotThreadSafe;

/**
 * 饿汉模式
 * 单例实例在类装载时进行创建
 */
@NotThreadSafe
public class SingletonExample6 {
    private SingletonExample6(){

    }
    //静态代码块和静态域的顺序问题导致结果不通
    //私有构造函数
    //单例对象
    private static SingletonExample6 instance=null;//1.

    static {//2
        instance=new SingletonExample6();
    }

    //静态工厂方法
    public static SingletonExample6 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance().hashCode());
        System.out.println(getInstance());
    }
}
