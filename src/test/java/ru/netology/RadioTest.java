package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    public void SetStationAboveLimit() {
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void SetStationUnderLimit() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void SetStationPositiveLimit() {
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void NextStationAboveLimit() {
        radio.setNextStation(9);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void PrevStationUnderLimit() {
        radio.setPrevStation(0);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void NextStationPositiveLimit() {
        radio.setNextStation(5);
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void PrevStationPositiveLimit() {
        radio.setPrevStation(5);
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void UpVolumeAboveLimit() {
        radio.setUpVolume(10);
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void DownVolumeUnderLimit() {
        radio.setDownVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void UpVolumePositiveLimit() {
        radio.setUpVolume(8);
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void DownVolumePositiveLimit() {
        radio.setDownVolume(4);
        assertEquals(3, radio.getCurrentVolume());
    }
}