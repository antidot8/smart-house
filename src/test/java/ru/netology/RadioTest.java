package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    public void setStationAboveLimit() {
        radio.setCurrentStation(10);
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void setStationUnderLimit() {
        radio.setCurrentStation(-1);
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void setStationPositiveLimit() {
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void nextStationAboveLimit() {
        for (int i = 0; i < 9; i = i + 1) {
            radio.setNextStation();
        }
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextStationPositiveLimit() {
        radio.setNextStation();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void prevStationUnderLimit() {
        for (int i = 0; i < 2; i = i + 1) {
            radio.setPrevStation();
        }
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void prevStationPositiveLimit() {
        radio.setPrevStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void upVolumeAboveLimit() {
        for (int i = 0; i < 10; i = i + 1) {
            radio.setUpVolume();
        }
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void upVolumePositiveLimit() {
        radio.setUpVolume();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void downVolumeUnderLimit() {
        for (int i = 0; i < 2; i = i + 1) {
            radio.setDownVolume();
        }
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void downVolumePositiveLimit() {
        radio.setDownVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}