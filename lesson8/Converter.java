package ru.synergyitacademy.lesson8;

public interface Converter {
    double convert (double perevod);
static Converter getConverter (Temperature temperature){
return temperature.getConverter();
}
}
