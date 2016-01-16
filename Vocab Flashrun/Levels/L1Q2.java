import greenfoot.*;

/**
 * Write a description of class L1Q2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class L1Q2 extends World
{

    /**
     * Constructor for objects of class L1Q2.
     * 
     */
    public L1Q2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 720, 1); 
    }
    
        public void act()
    {
        if(Greenfoot.isKeyDown("2"))
        Greenfoot.setWorld(new L1Q1());
        
        if(Greenfoot.isKeyDown("4"))
        Greenfoot.setWorld(new L1Q3());
    }
}
