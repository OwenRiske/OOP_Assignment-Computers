//Owen Riske

package com.company;

import java.util.ArrayList;

public class computerList {
//preset variables
    String listName;
    ArrayList<Computer>list;
//constructor for the computer List
    public computerList(String listName) {
        this.listName = listName;
        list= new ArrayList<Computer>();
    }
//adds to the computer list
    void add(Computer newComputer){
        list.add(newComputer);
    }

    //display/print the things inside the computer list
    void display(){
        int counter=1;
        for (int i=10; i>0; i--){
            for(Computer thisComputer: list){
                if (thisComputer.rating==i){
                    System.out.println(counter+". "+thisComputer.display);
                    counter++;
                }

            }
        }
    }
}
