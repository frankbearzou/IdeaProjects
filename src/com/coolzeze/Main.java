package com.coolzeze;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    private static void fun() {
        System.out.println("fun");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            list.add(i);
        }

        list.forEach(System.out::println);

        String s = "<b>he</b><a href='dd'>dd</a> <br> ";

    }

    public static void main(String[] args) {
	// write your code here
        fun();
        System.out.println("hello");

    }
}
