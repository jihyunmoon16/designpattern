package com.moon.designpattern.creational.factory;

/**
 * <pre>
 * @title  : GasCar 클래스
 * @author : Moon Jihyun
 * @since  : 2024-06-19
 * @version 1.0
 * @Modification
 * 수정일          수정자              수정내용
 * ------------------------------------------------------------------------------
 * 2024-06-19    Moon Jihyun        GasCar 최초생성
 * </pre>
 */
public class GasCar implements Car{
    @Override
    public void run() {
        System.out.println("Gas Car Run");
    }

    @Override
    public void stop() {
        System.out.println("Gas Car Stop");
    }
}
