package lesson0830;

import java.util.ArrayList;

/**
 * linzhe
 * 2020/8/30
 */
public class TestOverride extends TestOverideFather{

    public static String nameStatic;

    //
    public final Integer sexNan = 1;
    public final Integer sexNv = 2;

    public String name;

    public static void main(String[] args) {
        String aa = "nihao";
        aa.equals("nihao,nihao,aaa,nihaofas");
        String substring = aa.substring(0, 3);
        System.out.println(substring);
        String[] split = aa.split(",");
        boolean nihao = aa.contains("nihao");
        aa.replace("nihao", "nih");
        //equlas(比较是否相等) substring("截取字符串")
        for (int i = 0; i < 10; i++) {

        }
    }

    TestOverride() {

    }

    public static void aaaaaa() {

    }

    @Override
    public void aa() {
        TestOverride testOverride = new TestOverride();
        TestOverride.aaaaaa();
        System.out.println("儿子的aa");
    }

    public void aa(String name) {
        System.out.println(name);
    }

    public void aa(String name, int i) {
        System.out.println(name);
    }
}
