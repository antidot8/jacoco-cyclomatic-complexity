package ru.netology;

public class Radio {
    private int currentStation = 0;
    private int maxStation = 9;
    private int minStation = 0;

    public void setNextStation() {
        if (currentStation >= maxStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation + 1;
    }

    public void setPrevStation() {
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