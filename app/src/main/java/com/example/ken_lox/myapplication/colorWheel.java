package com.example.ken_lox.myapplication;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by ken_lox on 8/28/16.
 */
public class colorWheel {
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };


    public int getColor(){
        //the button clicked,update fact
        String colors;

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        colors= mColors[randomNumber];
        int colorAsInt= Color.parseColor(colors);

        return colorAsInt;

    };
}
