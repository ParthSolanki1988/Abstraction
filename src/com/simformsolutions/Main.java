package com.simformsolutions;

import com.simformsolutions.abstraction.Badminton;
import com.simformsolutions.abstraction.Cricket;
import com.simformsolutions.abstraction.Football;
import com.simformsolutions.abstraction.Sports;

public class Main {
    public static void main(String[] args) {

        Sports badminton = new Badminton();
        badminton.play();
        badminton.gameTypes();

        System.out.println("\n");

        Sports cricket = new Cricket();
        cricket.play();
        cricket.gameTypes();

        System.out.println("\n");

        Sports football = new Football();
        football.play();
        football.gameTypes();

    }
}