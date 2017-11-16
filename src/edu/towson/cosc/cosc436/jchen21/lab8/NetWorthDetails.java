package edu.towson.cosc.cosc436.jchen21.lab8;

public class NetWorthDetails {
    private Assets assets;
    private Liabilities liabilities;
    private double net_worth;

    public NetWorthDetails(Assets a, Liabilities l){
        assets = a;
        liabilities = l;
    }

    public Assets getAssets() {
        return assets;
    }

    public Liabilities getLiabilities() {
        return liabilities;
    }

    public double getNet_worth() {
        return net_worth;
    }

    private void calcNetWorth(){
        net_worth = 0;
        for(int i = 0; i < assets.getAssetArray().length; i++){
            net_worth = net_worth + assets.getAssetArray()[i].getValue();
        }
        for(int j = 0; j < liabilities.getLiabilityArray().length; j++){
            net_worth = net_worth - liabilities.getLiabilityArray()[j].getValue();
        }
    }
}
