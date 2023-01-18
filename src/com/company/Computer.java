//Owen Riske

package com.company;

public class Computer {
    //preset variables
    String name;
    String brand;
    int rating;
    String display;


//constuctors
Computer(String newName, String newBrand, int newRating){
    name=newName;
    rating=newRating;
    brand=newBrand;
    display=name+" made by "+brand;
}
void setRating(int newRating){
    rating=newRating;
}
int getRating(){
    return  rating;
}
void setBrand(String newBrand){
    display=display.replace(brand, newBrand);
    brand=newBrand;
    }
    String getBrand(){
        return  brand;
    }
    void setName(String newName){
        display=display.replace(name, newName);
        name=newName;
    }
    String getName(){
    return name;
    }

    void setDisplay(String display){
    this.display=display;
    }

    String getDisplay(){
    return display;
    }

}




