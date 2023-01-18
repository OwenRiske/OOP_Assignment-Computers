//Owen Riske
package com.company;

public class laptop extends Computer{
    int screenSize;
    String display;
    boolean touchScreen;

    laptop(String newName, String newBrand, int newRating, int screenSize) {
        super(newName, newBrand, newRating);
        this.screenSize=screenSize;
        touchScreen=false;
        this.display=getDisplay()+" with "+ screenSize+"\" screen";
        setDisplay(display);
    }
    laptop(String newName, String newBrand, int newRating, int screenSize, boolean touchScreen) {
        super(newName, newBrand, newRating);
        this.screenSize=screenSize;
        this.touchScreen=touchScreen;
        this.display=getDisplay()+" with "+ screenSize+"\" screen";
        if(touchScreen){
            display=display+"and has touch screen";
        }
        setDisplay(display);
    }

}
