package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.NotRecommend;
import com.mmall.concurrency.annoations.NotThreadSafe;

/**
 * 懒汉模式->双重同步锁单例模式
 * 单例实例在第一次使用时进行创建
 * 性能开销大
 */
@NotThreadSafe
@NotRecommend
public class SingletonExample4 {
    //私有构造函数
    private SingletonExample4(){

    }

    //1.memory=allocate()分配对象的内存空间
    //2.ctorInstance() 初始化对象
    //3.instance=memory 设置instance指向刚分配的内存

    //jvm和cpu优化，发生了指令重排
    //1.memory=allocate()分配对象的内存空间
    //3.instance=memory 设置instance指向刚分配的内存
    //2.ctorInstance() 初始化对象


    //单例对象
    private static SingletonExample4 instance=null;

    //静态工厂方法
    public static synchronized SingletonExample4 getInstance(){
        //多线程中出问题
        if (instance == null){
            synchronized (SingletonExample4.class){
                if (instance==null){
                    instance =new SingletonExample4();
                }
            }
        }
        return instance;
    }
}
