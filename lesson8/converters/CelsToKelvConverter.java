package ru.synergyitacademy.lesson8.converters;

import ru.synergyitacademy.lesson8.Converter;

public class CelsToKelvConverter implements Converter {
    @Override
    public double convert(double perevod) {
        return perevod + 273.15;
    }
}
