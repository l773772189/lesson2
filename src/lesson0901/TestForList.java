package lesson0901;

import com.lala.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * linzhe
 * 2020/9/1
 */
public class TestForList {

    //1 list 集合,每天都用到 小张,小王,小李 (小张) (小王) (小李)
    //2 map 键值对 key-value
    //3 set 集合

    //是什么,作用?
    //怎么用
    // 原理

    //fori 快捷键,快速生成for循环
    //list.for 快速循环
    //.sout 快速输出
    //psvm 生成主方法
    //方法后面.var可以直接生成对象的生命 ,比如new A(),直接在new A()后面.var 生成 A a=new A();
    //.if 可以快速生成if

    /**
     * 9月1日
     * 讲了 list 和 map
     * 作业:
     * 1 用list输出1-100之内的偶数
     * 2 用map去实现一个人资资源管理的查询功能,可以定义Person类,里面有name,age,sex属性,需求就是输入name,返回这个人的详细信息,必须用map去实现
     */

    public static void main(String[] args) {

        Renzhe minren = new Renzhe();
        minren.setName("漩涡鸣人");
        minren.setAge(10);

        Renzhe zuozhu = new Renzhe();
        zuozhu.setName("宇智波佐助");
        zuozhu.setAge(11);

        Renzhe kakaxi = new Renzhe();
        kakaxi.setName("旗木卡卡西");
        kakaxi.setAge(30);

        Renzhe sidai = new Renzhe();
        sidai.setName("波风水门");
        sidai.setAge(50);

        Renzhe xiaoying = new Renzhe();
        xiaoying.setName("小樱");
        xiaoying.setAge(9);

        List<Renzhe> list = new ArrayList();
        list.add(minren);
        list.add(zuozhu);
        list.add(kakaxi);
        list.add(sidai);
        list.add(xiaoying);

        //简单版
        for (Renzhe renzhe : list) {
            System.out.println(renzhe.getName());
        }
        System.out.println("当前忍者数:" + list.size());

        Renzhe renzhe3hao = list.get(3);
        System.out.println("忍者3号的名字是:" + renzhe3hao.getName());

        //复杂版
        //for (int i = 0; i < list.size(); i++) {
        //    list.get(i);
        //
        //}
    }
}
