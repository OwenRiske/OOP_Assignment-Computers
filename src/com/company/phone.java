//Owen Riske
package com.company;

public class phone extends Computer{
    int screenSize;
    boolean damaged;
    phone(String newName, String newBrand, int newRating, int screenSize) {
        super(newName, newBrand, newRating);
        this.screenSize=screenSize;
        damaged=false;
        this.display=getDisplay()+" with "+ screenSize+"\" screen";
        setDisplay(display);
    }
    phone(String newName, String newBrand, int newRating, int screenSize, boolean damaged) {
        super(newName, newBrand, newRating);
        this.screenSize=screenSize;
        this.damaged=damaged;
        this.display=getDisplay()+" with "+ screenSize+"\" screen";
        if (damaged){
            display=display+" and is damaged";
        }
        setDisplay(display);
    }
}
