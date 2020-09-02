package com.lz;

/**
 * linzhe
 * 2020/8/29
 */
public class Test0{

    //private 只能同类访问
    //default 只能同包
    //protect 同包 或 子类
    //public  所有

    public void aaa() {
        Dog dog = new Dog();
        System.out.println(dog.namePublic);
        System.out.println(dog.nameProtect);
        System.out.println(dog.nameDefault);
    }
}
