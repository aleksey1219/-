package ru.synergyitacademy.lesson8.converters;

import ru.synergyitacademy.lesson8.Converter;

public class FarToCelsConverter implements Converter {
    @Override
    public double convert(double perevod) {
        return (perevod - 32) / 1.8;
    }
}
