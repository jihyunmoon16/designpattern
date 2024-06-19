package com.moon.designpattern.creational.factory;

/**
 * <pre>
 * @title  : GasFactory 클래스
 * @author : Moon Jihyun
 * @since  : 2024-06-19
 * @version 1.0
 * @Modification
 * 수정일          수정자              수정내용
 * ------------------------------------------------------------------------------
 * 2024-06-19    Moon Jihyun        GasFactory 최초생성
 * </pre>
 */
public class GasFactory extends Factory{
    @Override
    public Car createCar() {
        return new GasCar();
    }
}
