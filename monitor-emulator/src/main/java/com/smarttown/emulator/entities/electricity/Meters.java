package com.smarttown.emulator.entities.electricity;

public enum Meters {
    SP_14("DeloR-24"),
    M_11("DeloR-24"),
    PH_10("DeloR-24"),
    O_12("NisFean-23"),
    P_11("BePheo-220"),
    SITA_11("BePheo-220"),
    ABF_17("HefT-256"),
    ABF_18("HefT-256"),
    ABF_27("HefT-256"),
    ABF_30("Heft-256");



    private String meterName;

    Meters(String meterName){
        this.meterName = meterName;
    }

    public String getMeterName() {
        return meterName;
    }
}
