package com.moon.designpattern.creational.abstractfactory;

/**
 * <pre>
 * @title  : ApplicationTest 클래스
 * @author : Moon Jihyun
 * @since  : 2024-06-20
 * @version 1.0
 * @Modification
 * 수정일          수정자              수정내용
 * ------------------------------------------------------------------------------
 * 2024-06-20    Moon Jihyun        ApplicationTest 최초생성
 * </pre>
 */
public class ApplicationTest {
    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    public static Application configurationApplication() {
        Application app;
        FurnitureFactory furnitureFactory;

        String furnitureType = "modern";

        if (furnitureType.equals("modern")) {
            furnitureFactory = new ModernFurnitureFactory();
        } else {
            furnitureFactory = new UniqueFurnitureFactory();
        }

        app = new Application(furnitureFactory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configurationApplication();
        app.legs();
    }
}
