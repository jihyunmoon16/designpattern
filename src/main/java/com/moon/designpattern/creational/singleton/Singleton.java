package com.moon.designpattern.creational.singleton;

/**
 * <pre>
 * @title  : Singleton 클래스
 * @author : Moon Jihyun
 * @since  : 2024-06-17
 * @version 1.0
 * @Modification
 * 수정일          수정자              수정내용
 * ------------------------------------------------------------------------------
 * 2024-06-17    Moon Jihyun        Singleton 최초생성
 * </pre>
 */
public class Singleton {
    // add a private static field to the class for storing the singleton instance
    private static Singleton instance;

    // make a constructor private
    private Singleton() {}

    // declare a public static creation method for getting the singleton instance
    public static Singleton getInstance() {
        // lazy initialization
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
