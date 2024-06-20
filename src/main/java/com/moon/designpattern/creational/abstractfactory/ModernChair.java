package com.moon.designpattern.creational.abstractfactory;

/**
 * <pre>
 * @title  : ModernChair 클래스
 * @author : Moon Jihyun
 * @since  : 2024-06-20
 * @version 1.0
 * @Modification
 * 수정일          수정자              수정내용
 * ------------------------------------------------------------------------------
 * 2024-06-20    Moon Jihyun        ModernChair 최초생성
 * </pre>
 */
public class ModernChair implements Chair{
    @Override
    public void legs() {
        System.out.println("modern chair has 4 legs");
    }
}
