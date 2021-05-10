package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setStationAboveLimit() {
        Radio radio = new Radio(63, 1);
        radio.setCurrentStation(64);
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void setStationUnderLimit() {
        Radio radio = new Radio(63, 1);
        radio.setCurrentStation(-1);
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void setStationPositiveLimit() {
        Radio radio = new Radio(63, 1);
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void nextStationAboveLimit() {
        Radio radio = new Radio(63, 63);
        radio.setNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextStationPositiveLimit() {
        Radio radio = new Radio(63, 1);
        radio.setNextStation();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void prevStationUnderLimit() {
        Radio radio = new Radio(63, 0);
        radio.setPrevStation();
        assertEquals(63, radio.getCurrentStation());
    }

    @Test
    public void prevStationPositiveLimit() {
        Radio radio = new Radio(63, 1);
        radio.setPrevStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextStationAboveLimitWithDefaultLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.setNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextStationPositiveLimitWithDefaultLimit() {
        Radio radio = new Radio();
        radio.setNextStation();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void prevStationUnderLimitWithDefaultLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPrevStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void prevStationPositiveLimitWithDefaultLimit() {
        Radio radio = new Radio();
        radio.setPrevStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setStationPositiveLimitWithDefaultLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void setStationOverLimitWithDefaultLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void setStationUnderLimitWithDefaultLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void upVolumeAboveLimit() {
        Radio radio = new Radio((byte) 100);
        radio.setUpVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void upVolumePositiveLimit() {
        Radio radio = new Radio();
        radio.setUpVolume();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void downVolumeUnderLimit() {
        Radio radio = new Radio((byte) 0);
        radio.setDownVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void downVolumePositiveLimit() {
        Radio radio = new Radio();
        radio.setDownVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setMaxStationUnderLimit() {
        Radio radio = new Radio();
        radio.setMaxStation(-1);
        assertEquals(10, radio.getMaxStation());
    }

    @Test
    public void setMaxStationPositiveLimit() {
        Radio radio = new Radio();
        radio.setMaxStation(63);
        assertEquals(63, radio.getMaxStation());
    }
}