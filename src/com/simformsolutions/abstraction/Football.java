package com.simformsolutions.abstraction;

public class Football implements Sports {
    @Override
    public void play() {
        System.out.println("In Football : 11 player in each team and 2 team required to play");
        System.out.println("Use Ball");
    }
    public void gameTypes(){
        System.out.println("Football : Outdoor Game");
    }
}
