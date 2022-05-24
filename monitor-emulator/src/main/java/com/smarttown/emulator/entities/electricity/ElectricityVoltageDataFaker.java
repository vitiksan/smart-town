package com.smarttown.emulator.entities.electricity;

import com.github.javafaker.Faker;

import java.time.LocalDateTime;

public class ElectricityVoltageDataFaker {

    private Double voltageStamp;

    private LocalDateTime voltageTimestamp;

    public Double getVoltageStamp() {
        return voltageStamp;
    }

    public ElectricityVoltageDataFaker(){
        Faker faker = new Faker();

        voltageStamp = faker.number().randomDouble(1, 180,300);
        voltageTimestamp = LocalDateTime.now();
    }

    public void setVoltageStamp(Double voltageStamp) {
        this.voltageStamp = voltageStamp;
    }

    public LocalDateTime getVoltageTimestamp() {
        return voltageTimestamp;
    }

    public void setVoltageTimestamp(LocalDateTime voltageTimestamp) {
        this.voltageTimestamp = voltageTimestamp;
    }

    @Override
    public String toString() {
        return "ElectricityVoltageDataFaker{" +"\n"+
                "voltageStamp=" + voltageStamp +",\n"+
                " voltageTimestamp=" + voltageTimestamp +"\n"+
                '}';
    }
}
