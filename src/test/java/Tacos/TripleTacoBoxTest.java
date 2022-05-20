package Tacos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripleTacoBoxTest {

    TripleTacoBox t;
    @BeforeEach
    void setUp(){
        t = new TripleTacoBox();
    }

    @Test
    @DisplayName("Checking initial value of taco == 3 after instantiation")
    void checkingTacoCountIsThree(){
        assertEquals(3, t.tacosRemaining());
    }


    @Test
    @DisplayName("Checking initial value of taco increments down when eat method is called")
    void checkingEatMethod(){
        int initialValue = t.tacosRemaining();
        t.eat();
        assertEquals(initialValue-1, t.tacosRemaining());
    }
}