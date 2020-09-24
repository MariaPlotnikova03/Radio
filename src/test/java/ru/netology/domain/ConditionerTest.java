package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void increaseCurrentTemperatureNormal() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(43);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureTestMaxBorder() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(43);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(43);
        conditioner.increaseCurrentTemperature();
        assertEquals(43, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureTestNormalTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(43);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        assertEquals(19, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureTestMinBorder() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(43);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(15);
        conditioner.decreaseCurrentTemperature();
        assertEquals(15, conditioner.getCurrentTemperature());
    }

    @Test
    public void setMaxTemperatureTest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(43);
        assertEquals(43, conditioner.getMaxTemperature());
    }

    @Test
    public void setMinTemperatureTest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(15);
        assertEquals(15, conditioner.getMinTemperature());

       }
    @Test
    public void setCurrentTemperatureOverMax(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(43);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(20);
        conditioner.setCurrentTemperature(60);
        assertEquals(20, conditioner.getCurrentTemperature());
    }

    @Test
    public void setCurrentTemperatureUnderMin(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(43);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(20);
        conditioner.setCurrentTemperature(10);
        assertEquals(20, conditioner.getCurrentTemperature());
    }

}