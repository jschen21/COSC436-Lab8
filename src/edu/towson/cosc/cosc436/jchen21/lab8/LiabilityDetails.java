package edu.towson.cosc.cosc436.jchen21.lab8;

public class LiabilityDetails {
    private String descript;
    private double value;

    public LiabilityDetails(String d, double v){
        descript = d;
        value = v;
    }

    public double getValue() {
        return value;
    }

    public String toString(){
        return (descript + "/n............" + value);
    }
}