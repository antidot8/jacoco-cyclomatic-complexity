package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

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
}