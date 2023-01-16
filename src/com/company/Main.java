//Owen Riske

package com.company;

public class Main {

    public static void main(String[] args) {
        //set objects
Computer firstComputer = new Computer("Macbook pro 13","Mac",9);
Computer secondComputer = new Computer("HP ENVY 13", "Windows",8);
//List
computerList computers = new computerList("Computers");
        //add to computer list
        computers.add(firstComputer);
        computers.add(secondComputer);

        //print the information through computerList
        computers.display();
        System.out.println("\n\n");
        firstComputer.setRating(7);
        computers.display();
    }
}
