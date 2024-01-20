package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionSexTest {

    private final String sex;
    Feline feline;

    public LionSexTest(String sex) {
        this.sex = sex;
    }

    // Тестовые данные
    @Parameterized.Parameters
    public static Object[] getDataForMane() {
        return new Object[]{
                "Лев",
                "Львица"
        };
    }

    @Test(expected = Exception.class)
    public void unknownSexReturnException() throws Exception {
        new Lion(sex, feline);
    }
}