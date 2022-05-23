package com.smarttown.aggregator.entities.electricity;

import com.github.javafaker.Faker;

public class MeterNonTechnicalFeaturesFaker {

    private String clientType;

    private String isRelayPresent;

    private String impactSensor;

    private String dataCollectionTechnology;

    private String accessType;

    public MeterNonTechnicalFeaturesFaker(){
        Faker faker = new Faker();

        this.clientType = faker.rickAndMorty().character();
        this.isRelayPresent = faker.options().option("Yes", "No", "Undetermined");
        this.impactSensor = faker.friends().character();
        this.dataCollectionTechnology = faker.harryPotter().spell();
        this.accessType = faker.hacker().abbreviation();
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getIsRelayPresent() {
        return isRelayPresent;
    }

    public void setIsRelayPresent(String isRelayPresent) {
        this.isRelayPresent = isRelayPresent;
    }

    public String getImpactSensor() {
        return impactSensor;
    }

    public void setImpactSensor(String impactSensor) {
        this.impactSensor = impactSensor;
    }

    public String getDataCollectionTechnology() {
        return dataCollectionTechnology;
    }

    public void setDataCollectionTechnology(String dataCollectionTechnology) {
        this.dataCollectionTechnology = dataCollectionTechnology;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    @Override
    public String toString() {
        return "MeterNonTechnicalFeaturesFaker{" +"\n"+
                "clientType='" + clientType + '\'' +",\n"+
                " isRelayPresent='" + isRelayPresent + '\'' +",\n"+
                " impactSensor='" + impactSensor + '\'' +",\n"+
                " dataCollectionTechnology='" + dataCollectionTechnology + '\'' +",\n"+
                " accessType='" + accessType + '\'' +"\n"+
                '}';
    }
}
