package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlexTest {

    @Test
    public void testGetFriends() throws Exception {
        Alex alex = new Alex(new Feline());
        List<String> expectedFriends = Arrays.asList("Марти", "Глория", "Мелман");
        assertEquals(expectedFriends, alex.getFriends());
    }

    @Test
    public void testPlaceOfResidence() throws Exception {
        Alex alex = new Alex(new Feline());
        assertEquals("Нью-Йорский зоопарк", alex.getPlaceOfResidence());
    }

    @Test
    public void testGetKittens() throws Exception {
        Alex alex = new Alex(new Feline());
        assertEquals(0, alex.getKittens());
    }
}