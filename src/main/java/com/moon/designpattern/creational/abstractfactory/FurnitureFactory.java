package com.moon.designpattern.creational.abstractfactory;

/**
 * <pre>
 * @title  : FurnitureFactory 클래스
 * @author : Moon Jihyun
 * @since  : 2024-06-20
 * @version 1.0
 * @Modification
 * 수정일          수정자              수정내용
 * ------------------------------------------------------------------------------
 * 2024-06-20    Moon Jihyun        FurnitureFactory 최초생성
 * </pre>
 */

/**
 * abstract factory knows about all (abstract) product types
 */
public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}
