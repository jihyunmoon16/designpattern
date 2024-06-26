package com.moon.designpattern.creational.abstractfactory.furniture;

/**
 * <pre>
 * @title  : UniqueChair 클래스
 * @author : Moon Jihyun
 * @since  : 2024-06-20
 * @version 1.0
 * @Modification
 * 수정일          수정자              수정내용
 * ------------------------------------------------------------------------------
 * 2024-06-20    Moon Jihyun        UniqueChair 최초생성
 * </pre>
 */
public class UniqueChair implements Chair {
    @Override
    public void legs() {
        System.out.println("unique chair has 2 legs");
    }
}
