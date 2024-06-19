package com.moon.designpattern.creational.factory;

/**
 * <pre>
 * @title  : Factory 클래스
 * @author : Moon Jihyun
 * @since  : 2024-06-19
 * @version 1.0
 * @Modification
 * 수정일          수정자              수정내용
 * ------------------------------------------------------------------------------
 * 2024-06-19    Moon Jihyun        Factory 최초생성
 * </pre>
 */

/**
 * provides an interface for creating objects in a superclass
 * but allows subclasses to alter the type of objects that will be created
 */
public abstract class Factory {

    // core business logic which needs different products to be created
    public void drive() {
        Car c = createCar();
        c.run();
    }

    public abstract Car createCar();
}
