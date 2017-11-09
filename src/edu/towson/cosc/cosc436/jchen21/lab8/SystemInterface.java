package edu.towson.cosc.cosc436.jchen21.lab8;

/**
 * Created by jchen21 on 11/9/2017.
 */
public class SystemInterface {
    private static Invoker invoker;

    public void initSystem(){
        invoker = new Invoker(new Aggregator());
    }

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
    }
}
