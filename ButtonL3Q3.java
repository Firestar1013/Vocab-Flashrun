import greenfoot.*;

/**
 * Write a description of class ButtonL3Q3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonL3Q3 extends Actor
{
    /**
     * Act - do whatever the ButtonL3Q3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click();
    }    
            private void click()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Level1(8));
        }
    }
}
