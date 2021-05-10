package ru.netology;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {
    private int currentStation = 1;
    private int maxStation = 10; // задаваемое общее кол-во, по умолчанию =10
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = 1;

    public Radio(int maxStation, int currentStation) {
        this.maxStation = maxStation;
        this.currentStation = currentStation;
    }

    public Radio(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation() {
        if (currentStation >= maxStation) {
            setCurrentStation(minStation);
            return;
        }
        setCurrentStation(currentStation + 1);
    }

    public void setPrevStation() {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
            return;
        }
        setCurrentStation(currentStation - 1);
    }

    public void setUpVolume() {
        if (currentVolume >= maxVolume) {
            setCurrentVolume(maxVolume);
            return;
        }
        setCurrentVolume(currentVolume + 1);
    }

    public void setDownVolume() {
        if (currentVolume <= minVolume) {
            setCurrentVolume(minVolume);
            return;
        }
        setCurrentVolume(currentVolume - 1);
    }

    public void setMaxStation(int maxStation) {
        if (maxStation < 1) {
            return;
        }
        this.maxStation = maxStation;
    }
}