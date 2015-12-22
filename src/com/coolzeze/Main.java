package com.coolzeze;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static double multiply(int a, int b) {
        double ret;
        ret = a * b;
        return ret;
    }

    private static void fun() {
        System.out.println("fun");

        String s = "<b>he</b><a href='dd'>dd</a> <br> ";
        System.out.println(s);
    }

    private static void fn2() {
        List<Integer> list = new ArrayList<>();
        for (int i = 9; i >= 0; --i) {
            list.add(i);
        }

        //Comparator<Integer> comp = (a, b) -> Integer.compare(a, b);
        list.sort(Comparator.comparing(Object::hashCode));

        list.forEach(System.out::println);


    }

    private static void fn3(File file) {
        //File[] files = file.listFiles((pathname) -> pathname.isDirectory() && pathname.toString().charAt(3) != '$');
        File[] files = file.listFiles(File::isDirectory);
        for (File f : files) {
            System.out.println(f.toString());
        }
    }

    private static void fn4(File file) {
        String[] fileNames = file.list((dir, name) -> name.endsWith(".txt"));
        for (String s : fileNames) {
            System.out.println(s);
        }
    }

    private static void print(String s) {
        System.out.println(s);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello");
    }

    private static void fn5() {
        String[] names = {"Peter", "Paul", "Mary"};
        List<Runnable> runners = new ArrayList<>();
        for (String s : names) {
            runners.add(() -> print(s));
        }

        for (Runnable r : runners) {
            new Thread(r).start();
        }
        /*for (int i = 0; i < runners.size(); ++i) {
            Thread t = new Thread(runners.get(i));
            t.start();
        }*/
    }

    private static void fn6() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; ++i) {
                System.out.println(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 5; i < 10; ++i) {
                System.out.println(i);
            }
        });

        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
	// write your code here
        fn6();


    }
}
