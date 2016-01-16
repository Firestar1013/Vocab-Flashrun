import greenfoot.*;

/**
 * Write a description of class L1Q3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class L1Q3 extends World
{

    /**
     * Constructor for objects of class L1Q3.
     * 
     */
    public L1Q3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 720, 1); 
    }
    
        public void act()
    {
        if(Greenfoot.isKeyDown("3"))
        Greenfoot.setWorld(new L1Q2());
        
    }
}
