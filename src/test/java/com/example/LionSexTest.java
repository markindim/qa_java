package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LionSexTest {
    private final String sex;
    private final boolean hasMane;

    public LionSexTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    // Тестовые данные
    @Parameterized.Parameters
    public static Collection<Object[]> getDataForMane() {
        return Arrays.asList(new Object[][]{
                {"Самец", true},
                {"Самка", false}
        });
    }

    @Test(expected = Exception.class)
    public void unknownSexReturnException() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion unknownSexLion = new Lion("Неизвестно", feline);
    }
}