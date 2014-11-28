package com.lutka.weatherstation;

/**
 * Created by Paulina on 23/11/2014.
 */
public class TemperatureGraphActivity extends GraphActivity
{
    @Override
    protected void onResponse(ReadingsFeed response)
    {
        drawGraph(response.getTemperatureReadings(), "Temperature");
    }
}