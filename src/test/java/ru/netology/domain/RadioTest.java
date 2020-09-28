package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void nextStationTestNormal() {
        Radio radio = new Radio(maxStation, minStation, radioStationCount, maxVolume, minVolume);
        radio.setCurrentStation(4);
        radio.nextStation();
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void nextStationTestMaxBorder() {
        Radio radio = new Radio(maxStation, minStation, radioStationCount, maxVolume, minVolume);
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void previousStationTestNormal() {
        Radio radio = new Radio(maxStation, minStation, radioStationCount, maxVolume, minVolume);
        radio.setCurrentStation(4);
        radio.previousStation();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void previousStationTestMinBorder() {
        Radio radio = new Radio(maxStation, minStation, radioStationCount, maxVolume, minVolume);
        radio.setCurrentStation(0);
        radio.previousStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void nextVolumeTestNormal() {
        Radio radio = new Radio(maxStation, minStation, radioStationCount, maxVolume, minVolume);
        radio.setCurrentVolume(4);
        radio.nextVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void nextVolumeTestMaxBorder() {
        Radio radio = new Radio(maxStation, minStation, radioStationCount, maxVolume, minVolume);
        radio.setCurrentVolume(10);
        radio.nextVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void previousVolumeTestNormal() {
        Radio radio = new Radio(maxStation, minStation, radioStationCount, maxVolume, minVolume);
        radio.setCurrentVolume(4);
        radio.previousVolume();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    public void previousVolumeTestMinBorder() {
        Radio radio = new Radio(maxStation, minStation, radioStationCount, maxVolume, minVolume);
        radio.setCurrentVolume(0);
        radio.previousVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeTestOverMax() {
        Radio radio = new Radio(maxStation, minStation, radioStationCount, maxVolume, minVolume);
        radio.setCurrentVolume(5);
        radio.setCurrentVolume(12);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeTestUnderMin() {
        Radio radio = new Radio(maxStation, minStation, radioStationCount, maxVolume, minVolume);
        radio.setCurrentVolume(5);
        radio.setCurrentVolume(-1);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentStationTestOverMax() {
        Radio radio = new Radio(maxStation, minStation, radioStationCount, maxVolume, minVolume);
        radio.setCurrentStation(5);
        radio.setCurrentStation(12);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationTestUnderMinStation() {
        Radio radio = new Radio(maxStation, minStation, radioStationCount, maxVolume, minVolume);
        radio.setCurrentStation(5);
        radio.setCurrentStation(-1);
        assertEquals(5, radio.getCurrentStation());
    }

}