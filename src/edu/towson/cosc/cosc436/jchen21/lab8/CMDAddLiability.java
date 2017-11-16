package edu.towson.cosc.cosc436.jchen21.lab8;

public class CMDAddLiability implements Command{
    private Aggregator agg;
    private String descript;
    private double value;

    public CMDAddLiability(String descript, double value, Aggregator agg){
        this.descript = descript;
        this.value = value;
        this.agg = agg;
    }

    public LiabilityDetails execute(){
        LiabilityDetails liabilities = new LiabilityDetails(descript, value);
        agg.getLiabilities().add(liabilities);
        return liabilities;
    }
}
