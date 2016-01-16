 import greenfoot.*;

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends World
{

    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 720, 1); 
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("Backspace"))
        Greenfoot.setWorld(new Title());
        
        if(Greenfoot.isKeyDown("2"))
        Greenfoot.setWorld(new L1Q1());
    }
}