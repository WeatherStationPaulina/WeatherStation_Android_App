package com.lutka.weatherstation;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * This class represents data coming from server
 *
 * @author Paulina
 * @version 1.0
 * @since 16/11/2014.
 */
public class ReadingsFeed
{
    @SerializedName("TemperatureReadings")
    List<Reading> temperatureReadings;

    @SerializedName("HumidityReadings")
    List<Reading> humidityReadings;

    @SerializedName("TemperatureForecast")
    List<Reading> temperatureForecast;

    @SerializedName("HumidityForecast")
    List<Reading> humidityForecast;

    public List<Reading> getTemperatureReadings()
    {
        return temperatureReadings;
    }

    public List<Reading> getHumidityReadings()
    {
        return humidityReadings;
    }

    public List<Reading> getTemperatureForecast()
    {
        return temperatureForecast;
    }

    public List<Reading> getHumidityForecast()
    {
        return humidityForecast;
    }
}



