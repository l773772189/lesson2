package lesson0830;

import sun.java2d.pipe.AAShapePipe;

import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * linzhe
 * 2020/8/30
 */
public class TestLogin {

    public static void main(String[] args) {

        //作业:用map和if else语句实现登录功能
        //需求1:当用户名不存在时,提示用户名不存在
        //需求2:当密码错误时,提示密码错误
        //需求3:当用户名正确,并且密码也正确时,提示登录成功

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String userName = scanner.next();
        System.out.println("请输入密码:");
        String password = scanner.next();
        Map<String, String> map = new HashMap<>();
        map.put("linzhe", "123456");
        map.put("xiaowang", "666");
        map.put("zhangsan", "777");
        map.put("xiaolu", "888");

        TestLogin testLogin = new TestLogin();
        testLogin.luoji2(map, userName, password);

    }

    public void luoji2(Map<String,String> map, String userName, String password) {
        String password2 = map.get(userName);
        Socket socket = new Socket();
        if (password2 == null) {
            System.out.println("用户名不存在");
            return;
        }
        if (!password2.equals(password)) {
            System.out.println("密码错误");
            return;
        }
        System.out.println("登录成功");
    }
}
