package ru.netology.domain;

public class Conditioner {
    private String name;
    private int minTemperature;
    private int maxTemperature;
    private int currentTemperature;
    private boolean on;


    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature)
            return; // early exit
        if (currentTemperature < minTemperature)
            return;// early exit
        // все проверки прошли
        this.currentTemperature = currentTemperature;
    }

    public void increaseCurrentTemperature() {
        int currentTemperature = this.currentTemperature;
        if (currentTemperature >= maxTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature + 1;
    }

    public void decreaseCurrentTemperature() {
        int currentTemperature = this.currentTemperature;
        if (currentTemperature <= minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature - 1;
    }


}
