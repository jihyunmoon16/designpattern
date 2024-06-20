package com.moon.designpattern.creational.abstractfactory;

/**
 * <pre>
 * @title  : UniqueFurnitureFactory 클래스
 * @author : Moon Jihyun
 * @since  : 2024-06-20
 * @version 1.0
 * @Modification
 * 수정일          수정자              수정내용
 * ------------------------------------------------------------------------------
 * 2024-06-20    Moon Jihyun        UniqueFurnitureFactory 최초생성
 * </pre>
 */
public class UniqueFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new UniqueChair();
    }

    @Override
    public Table createTable() {
        return new UniqueTable();
    }
}
