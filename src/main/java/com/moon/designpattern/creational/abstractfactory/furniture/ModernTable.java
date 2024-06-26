package com.moon.designpattern.creational.abstractfactory.furniture;

/**
 * <pre>
 * @title  : ModernTable 클래스
 * @author : Moon Jihyun
 * @since  : 2024-06-20
 * @version 1.0
 * @Modification
 * 수정일          수정자              수정내용
 * ------------------------------------------------------------------------------
 * 2024-06-20    Moon Jihyun        ModernTable 최초생성
 * </pre>
 */
public class ModernTable implements Table{
    @Override
    public void legs() {
        System.out.println("modern table has 4 legs");
    }
}
