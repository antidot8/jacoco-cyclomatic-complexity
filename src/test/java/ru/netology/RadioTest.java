package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    public void nextStationAboveLimit() {
        for (int i = 0; i < 9; i = i + 1) {
            radio.setNextStation();
        }
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevStationUnderLimit() {
        for (int i = 0; i < 2; i = i + 1) {
            radio.setPrevStation();
        }
        assertEquals(9, radio.getCurrentStation());
    }
}