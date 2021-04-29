package ru.netology;

public class Radio {
    private int currentStation = 0;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int currentVolume = 0;

    public void setNextStation(int currentStation) {
        if (currentStation >= maxStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation + 1;
    }

    public void setPrevStation(int currentStation) {
        if (currentStation <= minStation) {
            this.currentStation = maxStation;
            return;
        }
        this.currentStation = currentStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }
}