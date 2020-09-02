package com.lz;

/**
 * linzhe
 * 2020/8/27
 */
public class Dog {

    //private(1) defalut(2) protect(3) public(4)
    //8月29日 修饰符 作业 分别找到能访问4个权限,3个权限,2个权限,1个权限的地方

    public String namePublic;

    String nameDefault;

    protected String nameProtect;

    private String namePrivate;

    public void aa() {
        System.out.println(this.namePublic);
        System.out.println(this.nameProtect);
        System.out.println(this.nameDefault);
        System.out.println(this.namePrivate);
    }
}
