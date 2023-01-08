package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
@RunWith(Parameterized.class)

public class LionParameterizedTest {
    String sex;
    boolean hasMane;
    public LionParameterizedTest(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters(name = "Пол животного: {0}, hasMane: {1}")
    public static Object[][] getHasManeValue() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveMane() throws Exception{
        Lion lion = new Lion(sex, null);
        assertEquals(hasMane, lion.doesHaveMane());
    }
}

