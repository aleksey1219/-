package ru.synergyitacademy.lesson8.converters;

import ru.synergyitacademy.lesson8.Converter;

public class FarToKelvConverter implements Converter {
    @Override
    public double convert(double perevod) {
        return (perevod + 459.67)/ 1.8;
    }
}
