package ru.synergyitacademy.lesson8;

import ru.synergyitacademy.lesson8.converters.*;

public enum Temperature {
    FAR(new CelsToFarConverter()),
    KELV(new CelsToKelvConverter()),
    FAR_CELS(new FarToCelsConverter()),
    FAR_KELV(new FarToKelvConverter()),
    KELV_CELS(new KelvToCelsConverter()),
    KELV_FAR(new KelvToFarConverter());

    private Converter converter;

    Temperature(Converter converter) {
        this.converter = converter;
    }

    public Converter getConverter() {
        return this.converter;
    }

}