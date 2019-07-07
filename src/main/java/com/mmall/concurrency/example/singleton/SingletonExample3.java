package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.NotRecommend;
import com.mmall.concurrency.annoations.NotThreadSafe;

/**
 * 懒汉模式
 * 单例实例在第一次使用时进行创建
 * 性能开销大
 */
@NotThreadSafe
@NotRecommend
public class SingletonExample3 {
    //私有构造函数
    private SingletonExample3(){

    }
    //单例对象
    private static SingletonExample3 instance=null;

    //静态工厂方法
    public static synchronized SingletonExample3 getInstance(){
        //多线程中出问题
        if (instance == null){
            instance =new SingletonExample3();
        }
        return instance;
    }
}
