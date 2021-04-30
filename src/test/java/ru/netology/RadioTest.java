package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

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

}