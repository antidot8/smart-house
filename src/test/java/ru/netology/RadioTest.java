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
    public void NextStationPositiveAndAboveLimit() {
        radio.setNextStation();
        radio.setNextStation();
        radio.setNextStation();
        radio.setNextStation();
        radio.setNextStation();
        radio.setNextStation();
        radio.setNextStation();
        radio.setNextStation();
        radio.setNextStation();
        radio.setNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void PrevStationPositiveAndUnderLimit() {
        radio.setPrevStation();
        radio.setPrevStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void UpVolumePositiveAndAboveLimit() {
        radio.setUpVolume();
        radio.setUpVolume();
        radio.setUpVolume();
        radio.setUpVolume();
        radio.setUpVolume();
        radio.setUpVolume();
        radio.setUpVolume();
        radio.setUpVolume();
        radio.setUpVolume();
        radio.setUpVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void DownVolumePositiveAndUnderLimit() {
        radio.setDownVolume();
        radio.setDownVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}