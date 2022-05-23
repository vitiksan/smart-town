package com.smarttown.aggregator.entities.electricity;

import com.github.javafaker.Faker;

import java.time.LocalDateTime;

public class ElectricityMeterFaker {

    private String meterId;

    private String meterName;

    private ElectricityMeterFeaturesFaker featuresFaker;

    private ElectricityPowerUsageFaker powerUsageFaker;

    private ElectricityVoltageDataFaker voltageDataFaker;

    private LocalDateTime dataReceivedAt;

    private String signalLevel;

    public ElectricityMeterFaker(){
        Faker faker = new Faker();

        this.meterId = faker.options().option(Meters.class).toString();
                // faker.idNumber().valid(); //this should be static
        this.meterName = Meters.valueOf(meterId).getMeterName();
                //faker.commerce().productName();
        this.featuresFaker = new ElectricityMeterFeaturesFaker();
        /*
        todo: add powerUsageFakerData as list
        this.powerUsageFaker = new ArrayList<>();
        */
        this.powerUsageFaker = new ElectricityPowerUsageFaker();
        this.voltageDataFaker = new ElectricityVoltageDataFaker();
        this.dataReceivedAt = LocalDateTime.now();
        this.signalLevel = faker.options().option("GOOD", "NO DATA","LOW"); //probably static as well


    }


    public String getMeterId() {
        return meterId;
    }

    public void setMeterId(String meterId) {
        this.meterId = meterId;
    }

    public String getMeterName() {
        return meterName;
    }

    public void setMeterName(String meterName) {
        this.meterName = meterName;
    }

    public ElectricityMeterFeaturesFaker getFeaturesFaker() {
        return featuresFaker;
    }

    public void setFeaturesFaker(ElectricityMeterFeaturesFaker featuresFaker) {
        this.featuresFaker = featuresFaker;
    }

    public ElectricityPowerUsageFaker getPowerUsageFaker() {
        return powerUsageFaker;
    }

    public void setPowerUsageFaker(ElectricityPowerUsageFaker powerUsageFaker) {
        this.powerUsageFaker = powerUsageFaker;
    }

    public ElectricityVoltageDataFaker getVoltageDataFaker() {
        return voltageDataFaker;
    }

    public void setVoltageDataFaker(ElectricityVoltageDataFaker voltageDataFaker) {
        this.voltageDataFaker = voltageDataFaker;
    }

    public LocalDateTime getDataReceivedAt() {
        return dataReceivedAt;
    }

    public void setDataReceivedAt(LocalDateTime dataReceivedAt) {
        this.dataReceivedAt = dataReceivedAt;
    }

    public String getSignalLevel() {
        return signalLevel;
    }

    public void setSignalLevel(String signalLevel) {
        this.signalLevel = signalLevel;
    }

    @Override
    public String toString() {
        return "ElectricityMeterFaker{" +"\n"+
                "meterId='" + meterId + '\'' +",\n"+
                " meterName='" + meterName + '\'' +",\n"+
                " featuresFaker=" + featuresFaker +",\n"+
                " powerUsageFaker=" + powerUsageFaker +",\n"+
                " voltageDataFaker=" + voltageDataFaker +",\n"+
                " dataReceivedAt=" + dataReceivedAt +",\n"+
                " signalLevel='" + signalLevel + '\'' +"\n"+
                '}';
    }

}
