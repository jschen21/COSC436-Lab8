package edu.towson.cosc.cosc436.jchen21.lab8;

public class CMDGetNetWorth {
    private Assets assets;
    private Liabilities liabilities;

    public CMDGetNetWorth(Assets a, Liabilities l){
        this.assets = a;
        this.liabilities = l;
    }

    public NetWorthDetails execute(){
        NetWorthDetails netWorth = new NetWorthDetails(assets, liabilities);
        return netWorth;
    }
}
