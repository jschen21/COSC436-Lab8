package edu.towson.cosc.cosc436.jchen21.lab8;

/**
 * Created by jchen21 on 11/9/2017.
 */
public class SystemInterface {
    private static Invoker invoker;

    public static void initSystem(){
        invoker = new Invoker(new Aggregator());
    }

    public String[] addAsset(String descript, double value){
        AssetDetails asset = invoker.addAsset(descript, value);
    }

    public String[] addLiability(String descript, double value){
        LiabilityDetails liability = invoker.addLiability(descript, value);
    }

    public String[] getNetWorth(Assets a, Liabilities l){
        NetWorthDetails netWorth = invoker.getNetWorth(a, l);
    }

    /* example
    public String[] getMenu(){
        Menu menu = invoker.getMenu();
        menuItem item;
        int i = 0;
        String[] lines = new String[10];
        menu.reset();
        while(menu.hasNext()){
            item = menu.nextItem();
            lines[i] = item.toString();
            i++;
        }
        return lines;
    }*/


}
