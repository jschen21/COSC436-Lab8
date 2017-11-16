package edu.towson.cosc.cosc436.jchen21.lab8;

/**
 * Created by jchen21 on 11/9/2017.
 */
public class Invoker {
    public Aggregator aggregator;

    public Invoker(Aggregator aggregator){
        this.aggregator = aggregator;
    }

    public AssetDetails addAsset(String descript, double value){
        CMDAddAsset addAsset = new CMDAddAsset(descript, value, aggregator);
        addAsset.execute();

    }

    public LiabilityDetails addLiability(String descript, double value){
        CMDAddLiability addLiability = new CMDAddLiability(descript, value, aggregator);
        addLiability.execute();
    }

    public NetWorthDetails getNetWorth(){
        CMDGetNetWorth getNetWorth = new CMDGetNetWorth();
        getNetWorth.execute();
    }
}
