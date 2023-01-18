//Owen Riske

package com.company;

public class Main {

    public static void main(String[] args) {
        //set objects
Computer firstComputer = new Computer("Macbook pro 13","Mac",9);
Computer secondComputer = new Computer("HP ENVY 13", "Windows",8);
laptop firstLaptop = new laptop("ASUS L410 Ultra Thin Laptop","Windows",6,14);
phone firstPhone=new phone("Iphone 12", "Apple",7,6,true);
//List
computerList computers = new computerList("Computers");
        //add to computer list
        computers.add(firstComputer);
        computers.add(secondComputer);
        computers.add(firstLaptop);
        computers.add(firstPhone);


        //print the information through computerList
        computers.display();
        System.out.println("\n\n");
        firstComputer.setRating(7);
        computers.display();
        System.out.println("\n\n");
    }
}
