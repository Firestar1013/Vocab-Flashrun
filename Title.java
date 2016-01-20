import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.*;
/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 720, 1); 
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("1"))
            Greenfoot.setWorld(new Instructions()); 
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    
    private void prepare()
    {
        ButtonL1Q1 buttonl1q1 = new ButtonL1Q1();
        buttonl1q1.getImage().setTransparency(0);
        addObject(buttonl1q1, 139, 225);
        buttonl1q1.setLocation(132, 218);
        ButtonL1Q2 buttonl1q2 = new ButtonL1Q2();
        buttonl1q2.getImage().setTransparency(0);
        addObject(buttonl1q2, 577, 360);
        buttonl1q2.setLocation(131, 357);
        buttonl1q2.setLocation(131, 360);
        ButtonL1Q3 buttonl1q3 = new ButtonL1Q3();
        addObject(buttonl1q3, 139, 509);
        buttonl1q3.setLocation(137, 506);
        buttonl1q3.setLocation(133, 502);
        buttonl1q3.setLocation(132, 501);
        ButtonInstructions buttoninstructions = new ButtonInstructions();
        addObject(buttoninstructions, 627, 385);
        buttoninstructions.setLocation(701, 79);
        ButtonL2Q1 buttonl2q1 = new ButtonL2Q1();
        addObject(buttonl2q1, 826, 220);
        buttonl2q1.setLocation(825, 218);
        buttonl2q1.setLocation(825, 218);
        ButtonL2Q2 buttonl2q2 = new ButtonL2Q2();
        addObject(buttonl2q2, 834, 364);
        buttonl2q2.setLocation(829, 362);
        buttonl2q2.setLocation(826, 359);
        buttonl2q2.setLocation(826, 359);
        buttonl2q2.setLocation(827, 360);
        ButtonL2Q3 buttonl2q3 = new ButtonL2Q3();
        addObject(buttonl2q3, 833, 509);
        buttonl2q3.setLocation(826, 503);
        ButtonL3Q1 buttonl3q1 = new ButtonL3Q1();
        addObject(buttonl3q1, 344, 641);
        buttonl3q1.setLocation(337, 633);
        ButtonL3Q2 buttonl3q2 = new ButtonL3Q2();
        addObject(buttonl3q2, 480, 634);
        ButtonL3Q3 buttonl3q3 = new ButtonL3Q3();
        addObject(buttonl3q3, 627, 639);
        buttonl3q3.setLocation(621, 634);
        buttonl2q2.setLocation(827, 359);
    }
     /**
     * Wraps a single string into an array of strings for some maximum
     * number of characters. Also will split lines on newlines or the
     * characters "\n" allowing simple manually-placed newlines.
     *
     * Changed the regex, dded max, added newline split, removed extra
     * blank line at end.
     *
     * @see http://joust.kano.net/weblog/archives/000060.html
     */
    public static String[] wordWrap(String str, int max) {
        if (max <= 0) return new String[0];
        Pattern newline = Pattern.compile("\\\\n");
        Matcher nl = newline.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (nl.find()) {
            nl.appendReplacement(sb, "\n");
        }
        nl.appendTail(sb);
        str = new String(sb);
        Pattern wrapRE =
            Pattern.compile(".{0,"+(max-1)+"}(?:\\S(?:-| |\n|$)|\n|$)");
        List<String> list = new LinkedList<String>();
        Matcher m = wrapRE.matcher(str);
        while (m.find()) list.add(m.group());
        if (list.get(list.size() - 1).equals("")) list.remove(list.size() - 1);
        return (String[]) list.toArray(new String[list.size()]);
    }
}
