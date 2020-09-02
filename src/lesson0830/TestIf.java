package lesson0830;

import java.util.Scanner;

/**
 * linzhe
 * 2020/8/30
 */
public class TestIf {

    public static void main(String[] args) {
        Object ni = new Object();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入:");
        int i = scanner.nextInt();
        if (i > 20) {
            System.out.println("这个数字大于20");
        } else if (i < 10 && i > 5) {
            System.out.println("这个数字小于10并且大于5");
        } else {
            System.out.println("我是剩余的情况");
        }
    }
}
