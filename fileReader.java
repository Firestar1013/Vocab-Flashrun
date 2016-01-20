import greenfoot.*;
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class ExampleReader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fileReader extends Actor
{
    /**
     * Act - do whatever the ExampleReader wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     int curLine=0;
     String l;
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
     //   ((MyWorld) getWorld()).printLine(curLine);
         ((flashRunWorld) getWorld()).printQ(curLine);
     
          curLine++;
        if (curLine>=((flashRunWorld) getWorld()).getMaxLines())
          curLine=0;
     
      //  Greenfoot.stop();
    }
}
}
