package edu.towson.cosc.cosc436.jchen21.lab8;

public class Liabilities {
    private LiabilityDetails[] liability;
    private int pos = 0;

    public Liabilities(){
        liability = new LiabilityDetails[50];
    }

    public LiabilityDetails[] getLiabilityArray() {
        return liability;
    }

    public LiabilityDetails add(LiabilityDetails l){
        if(pos < liability.length){
            liability[pos] = l;
            pos++;
        }
        return l;
    }
}