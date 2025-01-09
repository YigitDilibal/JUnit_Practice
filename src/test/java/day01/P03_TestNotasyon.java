package day01;

import org.junit.jupiter.api.*;

public class P03_TestNotasyon {

    @BeforeAll
    public static void setup(){
        System.out.println("Test sureci baslatiliyor");
    }

    @AfterAll
    public static void teardown(){
        System.out.println("Test sureci tamamlandi");
    }

    @BeforeEach
    public void beforeTest(){
        System.out.println("Siradaki test calistirilacak");
    }

    @AfterEach
    public void afterTest(){
        System.out.println("Each Test Tamamlandi");
    }


    @Test
    public void test01(){
        System.out.println("Yigit = QA Engineer");
    }

    @Test
    public void test02(){
        System.out.println("Nihad - QA Engineer");
    }

    @Test
    public void test03(){
        System.out.println("Yusuf - QA Engineer");
    }




}
