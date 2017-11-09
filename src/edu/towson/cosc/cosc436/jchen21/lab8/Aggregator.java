package edu.towson.cosc.cosc436.jchen21.lab8;

import java.util.ArrayList;

/**
 * Created by jchen21 on 11/9/2017.
 */
public class Aggregator {
    private ArrayList<Assets> total_assets;
    private ArrayList<Liabilities> total_liabilities;

    public Create(){
        total_assets = new ArrayList<>();
        total_liabilities = new ArrayList<>()
    }

    public ArrayList<Assets> getAssets(){
        return total_assets;
    }

}
