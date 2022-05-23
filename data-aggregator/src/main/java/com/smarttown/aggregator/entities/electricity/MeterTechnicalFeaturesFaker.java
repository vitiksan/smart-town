package com.smarttown.aggregator.entities.electricity;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class MeterTechnicalFeaturesFaker {

    private Integer phaseAmount;

    private String power;

    private String powerMeasure;

    private Integer accuracyClass;

    private String voltage;

    private String voltageMeasure;

    private Double electricCurrent;

    private List<String> electricityMeasureClass;


    public MeterTechnicalFeaturesFaker(){
        Faker faker = new Faker();

        this.phaseAmount = faker.number().numberBetween(1,3);
        this.power = faker.regexify("[0-9][A-Z]");
        this.powerMeasure = faker.regexify("[A-Z]");
        this.voltage = faker.regexify("[0-9][A-Z]");
        this.accuracyClass = faker.number().numberBetween(1,10);
        this.voltageMeasure = faker.regexify("[A-Z]");
        this.electricCurrent = faker.number().randomDouble(1,0,7);
        electricityMeasureClass = new ArrayList<>();
        for (int i = 0; i < faker.number().numberBetween(1,5); i++) {
            electricityMeasureClass.add(faker.pokemon().name());
        }

    }

    public Integer getPhaseAmount() {
        return phaseAmount;
    }

    public void setPhaseAmount(Integer phaseAmount) {
        this.phaseAmount = phaseAmount;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getPowerMeasure() {
        return powerMeasure;
    }

    public void setPowerMeasure(String powerMeasure) {
        this.powerMeasure = powerMeasure;
    }

    public Integer getAccuracyClass() {
        return accuracyClass;
    }

    public void setAccuracyClass(Integer accuracyClass) {
        this.accuracyClass = accuracyClass;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public Double getElectricCurrent() {
        return electricCurrent;
    }

    public void setElectricCurrent(Double electricCurrent) {
        this.electricCurrent = electricCurrent;
    }

    public List<String> getElectricityMeasureClass() {
        return electricityMeasureClass;
    }

    public void setElectricityMeasureClass(List<String> electricityMeasureClass) {
        this.electricityMeasureClass = electricityMeasureClass;
    }

    public String getVoltageMeasure() {
        return voltageMeasure;
    }

    public void setVoltageMeasure(String voltageMeasure) {
        this.voltageMeasure = voltageMeasure;
    }

    @Override
    public String toString() {
        return "MeterTechnicalFeaturesFaker{" +"\n"+
                "phaseAmount=" + phaseAmount +",\n"+
                " power='" + power + '\'' +",\n"+
                " powerMeasure='" + powerMeasure + '\'' +",\n"+
                " accuracyClass=" + accuracyClass +",\n"+
                " voltage='" + voltage + '\'' +",\n"+
                " voltageMeasure='" + voltageMeasure + '\'' +",\n"+
                " electricCurrent=" + electricCurrent +",\n"+
                " electricityMeasureClass=" + electricityMeasureClass +"\n"+
                '}';
    }
}
