package com.example.climatec.models;

public class WeatherCurrent {

    private double temperature;
    private int relativeHumidity;
    private double windSpeed;

    public double getTemperature() {
        return temperature;
    }
    @SerializedName("temperature")
    @Expose
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    @SerializedName("relativeHumidity")
    @Expose
    public int getRelativeHumidity() {
        return relativeHumidity;
    }

    public void setRelativeHumidity(int relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }
    @SerializedName("windSpeed")
    @Expose
    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

}
