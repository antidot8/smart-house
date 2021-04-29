package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    public void AboveStationLimit() {
        int actual = radio.setCurrentStation(10);
        assertEquals(0, actual);
    }

    @Test
    public void UnderStationLimit() {
        int actual = radio.setCurrentStation(-1);
        assertEquals(9, actual);
    }

    @Test
    public void PositiveStationLimit() {
        int actual = radio.setCurrentStation(5);
        assertEquals(5, actual);
    }

    @Test
    public void AboveVolumeLimit() {
        int actual = radio.setCurrentVolume(11);
        assertEquals(10, actual);
    }

    @Test
    public void UnderVolumeLimit() {
        int actual = radio.setCurrentVolume(-1);
        assertEquals(0, actual);
    }

    @Test
    public void PositiveVolumeLimit() {
        int actual = radio.setCurrentVolume(4);
        assertEquals(4, actual);
    }
}