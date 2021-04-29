package ru.netology;

public class Radio {
    private int currentStation;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume;

    public int setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            currentStation = 9;
            return currentStation;
        }
        if (currentStation > 9) {
            currentStation = 0;
            return currentStation;
        }
        this.currentStation = currentStation;
        return currentStation;
    }

    public int setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            currentVolume = 10;
            return currentVolume;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
            return currentVolume;
        }
        this.currentVolume = currentVolume;
        return currentVolume;
    }
}