package Tacos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomTacosTest {
    CustomTacos ct;
    @BeforeEach
    void setUp(){
        ct = new CustomTacos(5);
    }

    @Test
    @DisplayName("Checking Taco variable initialization value")
    void checkingTacoValueUponInstance(){
        assertEquals(5, ct.tacosRemaining());
    }

    @Test
    @DisplayName("Checking initial value of taco increments down when eat method is called")
    void checkingEatMethod(){
        int initialValue = ct.tacosRemaining();
        ct.eat();
        assertEquals(initialValue-1, ct.tacosRemaining());
    }

}