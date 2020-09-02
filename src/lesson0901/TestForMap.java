package lesson0901;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * linzhe
 * 2020/9/1
 */
public class TestForMap {

    //1 业务 货位盘点,波次 100 订单  1衣服 裤子    2帽子  99 衣服,
    //2 代码 很看不懂

    //找一个老师,相对很友善,很有耐心,经常麻烦他
    //入职:前三个月,业务,技术面临的挑战,

    //list存储
    //null.

    public static void main(String[] args) {
        TestForMap testForMap = new TestForMap();
        Renzhe renzhe = testForMap.queryRenzhe("漩涡鸣人");//是这一行代码报错了
        if (renzhe != null) {
            System.out.println(renzhe.getAge());
            System.out.println(renzhe.getName());
            System.out.println(renzhe.getLevel());
        } else {
            System.out.println("查询不到该忍者");
        }
    }


    /**
     * 输入忍者的名字,返回忍者的详细信息
     */
    public Renzhe queryRenzhe(String name) {

        Renzhe minren = new Renzhe();
        minren.setName("漩涡鸣人");
        minren.setAge(10);
        minren.setLevel("上忍");

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
        //for (Renzhe var : list) {
        //    if (var.getName().equals(name)) {
        //        return var;
        //    }
        //}

        Map<String, Renzhe> map = new HashMap<>();
        map.put("漩涡鸣人", minren);
        map.put("小樱", xiaoying);
        map.put("波风水门", sidai);
        map.put("宇智波佐助", zuozhu);
        map.put("旗木卡卡西", kakaxi);
        Renzhe renzhe = map.get(name);
        return renzhe;
    }
}
