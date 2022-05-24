package com.smarttown.emulator.entities.electricity;

public class ElectricityMeterFeaturesFaker {

    private MeterNonTechnicalFeaturesFaker nonTechnicalFeaturesFaker;

    private MeterTechnicalFeaturesFaker technicalFeaturesFaker;

    public ElectricityMeterFeaturesFaker(){
        this.nonTechnicalFeaturesFaker = new MeterNonTechnicalFeaturesFaker();
        this.technicalFeaturesFaker = new MeterTechnicalFeaturesFaker();
    }

    public MeterNonTechnicalFeaturesFaker getNonTechnicalFeaturesFaker() {
        return nonTechnicalFeaturesFaker;
    }

    public void setNonTechnicalFeaturesFaker(MeterNonTechnicalFeaturesFaker nonTechnicalFeaturesFaker) {
        this.nonTechnicalFeaturesFaker = nonTechnicalFeaturesFaker;
    }

    public MeterTechnicalFeaturesFaker getTechnicalFeaturesFaker() {
        return technicalFeaturesFaker;
    }

    public void setTechnicalFeaturesFaker(MeterTechnicalFeaturesFaker technicalFeaturesFaker) {
        this.technicalFeaturesFaker = technicalFeaturesFaker;
    }

    @Override
    public String toString() {
        return "ElectricityMeterFeaturesFaker{" +"\n"+
                "nonTechnicalFeaturesFaker=" + nonTechnicalFeaturesFaker +",\n"+
                "technicalFeaturesFaker=" + technicalFeaturesFaker +"\n"+
                '}';
    }
}
