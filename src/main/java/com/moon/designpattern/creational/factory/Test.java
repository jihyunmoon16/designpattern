package com.moon.designpattern.creational.factory;

/**
 * <pre>
 * @title  : Test 클래스
 * @author : Moon Jihyun
 * @since  : 2024-06-19
 * @version 1.0
 * @Modification
 * 수정일          수정자              수정내용
 * ------------------------------------------------------------------------------
 * 2024-06-19    Moon Jihyun        Test 최초생성
 * </pre>
 */
public class Test {

    private static Factory factory;

    public static void main(String[] args) {
        configure(2);
        runBusinessLogic();
    }

    // the concrete factory is usually chosen depending on configuration or environment options
    static void configure(int type) {
        if (type == 1) {
            factory = new GasFactory();
        } else {
            factory = new EVFactory();
        }
    }

    static void runBusinessLogic() {
        factory.drive();
    }

}
