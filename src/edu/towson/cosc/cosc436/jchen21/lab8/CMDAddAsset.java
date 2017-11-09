package edu.towson.cosc.cosc436.jchen21.lab8;

/**
 * Created by jchen21 on 11/9/2017.
 */
public class CMDAddAsset implements Command {
    private Aggregator agg;
    private String descript;
    private double value;
    public CMDAddAsset(String descript, double value, Aggregator agg){
        this.descript = descript;
        this.value = value;
        this.agg = agg;
    }
    public Assets Execute(){
        Assets assets = new Assets(descript, value);
        agg.getAssets().add(assets);
        return assets;
    }
}
