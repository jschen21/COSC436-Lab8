package edu.towson.cosc.cosc436.jchen21.lab8;

public class AssetDetails {
    private String descript;
    private double value;

    public AssetDetails(String d, double v){
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
