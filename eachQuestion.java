import greenfoot.*; // (World, Actor, GreenfootImage, and Greenfoot)
import java.awt.Color;
import java.awt.Font;
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class eachQuestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class eachQuestion extends Actor
{
    
    public static final float FONT_SIZE = 24.0f;
    public static final int WIDTH = 550;
    public static final int HEIGHT = 120;
    public static final int MAXSCORE = 15; // If we get here, stop the game, set the title to "GAME OVER" and prefix to "You Won"
    public static final int MINSCORE = -1; 
    private String title;
     int curLine=0;
    int questionNum;
    public ArrayList<String> lines;
  
     String l;

    /**
     * Act - do whatever the eachQuestion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public  eachQuestion(int num)
    {
        questionNum = num;
    }
    public void act() 
    {
        
        // ((Level1) getWorld()).printQ(questionNum);
     
          //curLine++;  // commented out by me to stop the iteration in act();
       // if (curLine>=((Level1) getWorld()).getMaxLines())
        title=((Level1)getWorld()).getLines();
       // System.out.println("OKay");
       
            // title= lines.get(3);
           // ((Level1) getWorld()).showText(title,200,135);
         //  title = "What a nice day";
         makeImage(title);
        
         // curLine=0;
    } 
     public void makeImage(String title)
    {
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);
        
        image.setColor(new Color(0, 0, 0, 160));
        image.fillRect(0, 0, WIDTH, HEIGHT);
        image.setColor(new Color(255, 255, 255, 100));
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(title, 30, 30);
        //image.drawString(prefix + score, 30, 60);
      setImage(image);
    }
    
    /**
    * Write anything on the board
    */
    public void setTitle(String txt)
    {
        title=txt;
      //  makeImage(title, prefix, score);
    }
}
