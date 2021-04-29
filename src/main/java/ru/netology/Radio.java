package ru.netology;

public class Radio {
    private int currentStation = 0;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume = 0;

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation(int currentStation) {
        if (currentStation >= maxStation) {
            setCurrentStation(minStation);
            return;
        }
        setCurrentStation(currentStation + 1);
    }

    public void setPrevStation(int currentStation) {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
            return;
        }
        setCurrentStation(currentStation - 1);
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setUpVolume(int currentVolume) {
        if (currentVolume >= maxVolume) {
            setCurrentVolume(maxVolume);
            return;
        }
        setCurrentVolume(currentVolume + 1);
    }

    public void setDownVolume(int currentVolume) {
        if (currentVolume <= minVolume) {
            setCurrentVolume(minVolume);
            return;
        }
        setCurrentVolume(currentVolume - 1);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }
}