package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(3);
        assertEquals("Результат не совпадает", 3, lion.getKittens());
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals("Результат не совпадает", true, lion.doesHaveMane());
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expendedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expendedFood);
        assertEquals("Результат не совпадает", expendedFood, lion.getFood());
    }
}