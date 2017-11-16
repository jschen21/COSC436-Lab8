package edu.towson.cosc.cosc436.jchen21.lab8;

public class NetWorthDetails {
    private AssetDetails assets;
    private LiabilityDetails liabilities;
    private double net_worth;

    public NetWorthDetails(AssetDetails a, LiabilityDetails l){
        assets = a;
        liabilities = l;
    }

    public AssetDetails getAssets() {
        return assets;
    }

    public LiabilityDetails getLiabilities() {
        return liabilities;
    }

    public double getNet_worth() {
        return net_worth;
    }

    private void calcNetWorth(){
        net_worth = (assets.getValue() - liabilities.getValue());
    }
}
