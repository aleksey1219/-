package ru.synergyitacademy.lesson8.converters;

import ru.synergyitacademy.lesson8.Converter;

public class KelvToFarConverter implements Converter {
    @Override
    public double convert(double perevod) {
        return perevod * 1.8 - 459.67;
    }
}
