package com.moon.designpattern.creational.abstractfactory.furniture;

/**
 * <pre>
 * @title  : Test 클래스
 * @author : Moon Jihyun
 * @since  : 2024-06-20
 * @version 1.0
 * @Modification
 * 수정일          수정자              수정내용
 * ------------------------------------------------------------------------------
 * 2024-06-20    Moon Jihyun        Test 최초생성
 * </pre>
 */
public class Application {
        private Chair chair;
        private Table table;

        public Application(FurnitureFactory furnitureFactory) {
            chair = furnitureFactory.createChair();
            table = furnitureFactory.createTable();
        }

        public void legs() {
                chair.legs();
                table.legs();
        }
}
