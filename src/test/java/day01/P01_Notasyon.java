package day01;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.SortedMap;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class P01_Notasyon {



    @Test
    @Order(1)
    public void Berkay(){
        System.out.println("Berkay");
    }

    @Test
    @Order(2)
    public void Nihad(){
        System.out.println("Nihad");
    }

    @Test
    @Order(3)
    public void Yigit(){
        System.out.println("Yigit");
    }

    @Test
    @Order(4)
    public void Sude(){
        System.out.println("Sude");
    }

}
