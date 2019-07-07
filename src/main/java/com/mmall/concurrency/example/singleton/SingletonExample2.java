package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.NotThreadSafe;

/**
 * 饿汉模式
 * 单例实例在类装载时进行创建
 */
@NotThreadSafe
public class SingletonExample2 {
    //私有构造函数
    private SingletonExample2(){
        //如果有太多处理，产生性能问题
    }
    //单例对象
    private static SingletonExample2 instance=new SingletonExample2();

    //静态工厂方法
    public static SingletonExample2 getInstance(){
        return instance;
    }
}
