package edu.towson.cosc.cosc436.jchen21.lab8;

public class Assets {
    private AssetDetails[] asset;
    private int pos = 0;

    public Assets(){
        asset = new AssetDetails[50];
    }

    public AssetDetails[] getAssetArray() {
        return asset;
    }

    public AssetDetails add(AssetDetails a){
        if(pos < asset.length){
            asset[pos] = a;
            pos++;
        }
        return a;
    }
}
