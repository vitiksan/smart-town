package com.smarttown.aggregator.entities.electricity;


import com.github.javafaker.Faker;

import java.time.LocalDateTime;

public class ElectricityPowerUsageFaker {

    private String phaseId;

    private Double currentValue;

    private LocalDateTime dataTimestamp;

    public ElectricityPowerUsageFaker(){
        Faker faker = new Faker();

        this.phaseId = faker.idNumber().valid(); //should be static
        this.currentValue = faker.number().randomDouble(1, 5000, Integer.MAX_VALUE);
        this.dataTimestamp = LocalDateTime.now();
    }

    public String getPhaseId() {
        return phaseId;
    }

    public void setPhaseId(String phaseId) {
        this.phaseId = phaseId;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }

    public LocalDateTime getDataTimestamp() {
        return dataTimestamp;
    }

    public void setDataTimestamp(LocalDateTime dataTimestamp) {
        this.dataTimestamp = dataTimestamp;
    }

    @Override
    public String toString() {
        return "ElectricityPowerUsageFaker{" +"\n"+
                "phaseId='" + phaseId + '\'' +",\n"+
                " currentValue=" + currentValue +",\n"+
                " dataTimestamp=" + dataTimestamp +"\n"+
                '}';
    }
}
