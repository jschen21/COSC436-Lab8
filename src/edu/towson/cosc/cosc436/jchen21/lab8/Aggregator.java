package edu.towson.cosc.cosc436.jchen21.lab8;

import java.util.ArrayList;

/**
 * Created by jchen21 on 11/9/2017.
 */
public class Aggregator {
    private Assets total_assets;
    private Liabilities total_liabilities;

    public Aggregator(){
        total_assets = new Assets();
        total_liabilities = new Liabilities();
    }

    public Assets getAssets(){
        return total_assets;
    }
    public Liabilities getLiabilities(){
        return total_liabilities;
    }
}
