package edu.towson.cosc.cosc436.jchen21.lab8;

/**
 * Created by jchen21 on 11/9/2017.
 */
public class Assets {
    private String description;
    private double amount;

    public Assets(String description, double amount){
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }
    public double getAmount(){
        return amount;
    }
}
